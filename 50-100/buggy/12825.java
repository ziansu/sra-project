public long timestampForPlanetFile(java.lang.String filename) {
    java.util.regex.Pattern longDatePattern = java.util.regex.Pattern.compile("\\d{8}");
    java.util.regex.Pattern shortDatePattern = java.util.regex.Pattern.compile("\\d{6}");
    java.util.regex.Matcher dateMatcher = longDatePattern.matcher(filename);
    if (dateMatcher.matches()) {
    }else {
        dateMatcher = longDatePattern.matcher(filename);
        if (dateMatcher.matches()) {
        }
    }
}