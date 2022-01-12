public static java.util.List<com.junichi11.netbeans.modules.color.codes.preview.colors.ColorValue> getNamedColors(java.lang.String line, int lineNumber) {
    java.util.regex.Matcher matcher = com.junichi11.netbeans.modules.color.codes.preview.utils.ColorsUtils.getColorMatcher(line, com.junichi11.netbeans.modules.color.codes.preview.utils.ColorsUtils.ColorType.NAMED_COLORS);
    java.util.ArrayList<com.junichi11.netbeans.modules.color.codes.preview.colors.ColorValue> colorValues = new java.util.ArrayList<>();
    while (matcher.find()) {
        final java.lang.String namedColor = matcher.group(0);
        com.junichi11.netbeans.modules.color.codes.preview.colors.ColorValue colorValue = new com.junichi11.netbeans.modules.color.codes.preview.colors.NamedColorValue(namedColor, matcher.start(), matcher.end(), lineNumber);
        colorValues.add(colorValue);
    } 
    return colorValues;
}