public java.lang.String getColorNameFromStr(java.lang.String colorStr) {
    java.lang.String str = colorStr.trim();
    for (org.asqatasun.utils.colornamelookup.ColorNameLookup.ColorName c : colorList) {
        java.lang.String name = c.getName();
        if (name.equalsIgnoreCase(str)) {
            return name;
        }
    }
    return "";
}