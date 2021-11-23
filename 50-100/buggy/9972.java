public static java.lang.String toPascalCase(java.lang.String string) {
    java.lang.StringBuilder nb = new java.lang.StringBuilder();
    for (java.lang.String word : com.psddev.dari.util.StringUtils.splitString(string)) {
        nb.append(java.lang.Character.toUpperCase(word.charAt(0))).append(word.substring(1));
    }
    return nb.toString();
}