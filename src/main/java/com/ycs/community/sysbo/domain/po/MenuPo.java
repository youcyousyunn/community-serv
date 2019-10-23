package com.ycs.community.sysbo.domain.po;

import com.ycs.community.basebo.domain.po.BasePo;
import lombok.Data;

import java.util.List;

@Data
public class MenuPo extends BasePo {
    private Long id;
    private Long pid;
    private String name;
    private String path;
    private String component;
    private boolean hidden;
    private boolean cache;
    private String redirect;
    private boolean alwaysShow;
    private boolean iFrame;
    private String icon;
    private List<MenuPo> children;
    private MenuMetaPo meta;
    private int sort;
}
