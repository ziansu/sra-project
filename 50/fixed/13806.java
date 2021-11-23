private java.lang.String removeTrailingNameSeparator(java.lang.String key) {
    return org.apache.commons.lang.StringUtils.removeEnd(org.apache.commons.lang.StringUtils.removeEnd(key, "/"), "\\");
}