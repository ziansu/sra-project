public java.lang.String getColorNameFromStr(java.lang.String colorStr) {
    colorStr = colorStr.trim();
    for (org.asqatasun.utils.colornamelookup.ColorNameLookup.ColorName c : colorList) {
        java.lang.String name = c.getName();
        if (name.equalsIgnoreCase(colorStr)) {
            return name;
        }
    }
    return "";
}