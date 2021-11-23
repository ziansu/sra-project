private void parseExactPointsByYear(java.lang.String year) {
    java.lang.String regex = "<table border=\"1\" bordercolor=\"#cccccc\"";
    regex += ".+?<strong>(\\d{4})\\D+</strong>";
    regex += ".+?</table>";
    java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex, java.util.regex.Pattern.CASE_INSENSITIVE).matcher(source);
    while (m.find()) {
        java.lang.String whatYear = m.group(1);
        if (com.sirap.basic.util.StrUtil.equals(year, whatYear)) {
            java.lang.String contentByYear = m.group();
            mexItems = parse24Points(contentByYear);
            return ;
        }
    } 
}