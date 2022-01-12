public java.awt.Color getColorFromName(java.lang.String colorStr) {
    colorStr = colorStr.trim();
    for (org.asqatasun.utils.colornamelookup.ColorNameLookup.ColorName c : colorList) {
        java.lang.String name = c.getName();
        if (name.equalsIgnoreCase(colorStr)) {
            return new java.awt.Color(c.getRed(), c.getGreen(), c.getBlue());
        }
    }
    return null;
}