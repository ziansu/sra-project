public static java.lang.String templateNameToName(java.lang.String templateName) {
    int pos = templateName.indexOf('.');
    if (pos < 1) {
        throw new java.lang.IllegalArgumentException("Invalid template name format (unable find first dot character)");
    }
    return templateName.substring(0, pos);
}