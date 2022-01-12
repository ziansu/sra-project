public static cn.rui.chm.SharpSystem.HhpOption optionNameOf(java.lang.String optionName) {
    for (cn.rui.chm.SharpSystem.HhpOption hhpOption : cn.rui.chm.SharpSystem.HhpOption.values()) {
        if ((hhpOption.optionName) == optionName) {
            return hhpOption;
        }
    }
    return null;
}