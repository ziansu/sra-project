private static java.lang.String getFilterRegex(java.lang.String nameFilter) {
    java.lang.String regex = ("\\b.*" + (nameFilter.replaceAll("\\*", ".*"))) + ".*\\b";
    regex = regex.replaceAll(" ", ".*");
    regex = regex.replaceAll("\\?", ".?");
    regex = regex.replaceAll("[\\{\\}\\[\\]]", "\\.");
    try {
        java.util.regex.Pattern.compile(regex);
    } catch (java.lang.Throwable e) {
        regex = ".*";
        org.talend.commons.exception.CommonExceptionHandler.process(e, org.apache.log4j.Priority.WARN);
    }
    return regex;
}