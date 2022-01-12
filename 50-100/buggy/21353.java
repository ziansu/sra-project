public static com.openthinks.easyweb.context.RequestSuffix build(java.lang.String suffixStr) {
    java.lang.String[] suffixArray = suffixStr.split(com.openthinks.easyweb.context.RequestSuffix.SUFFIX_MULTI_SPLIT);
    com.openthinks.easyweb.context.RequestSuffix rs = new com.openthinks.easyweb.context.RequestSuffix();
    for (java.lang.String suffix : suffixArray) {
        if ((suffix != null) && (!("".equals(suffix.trim())))) {
            rs.option(suffix.trim());
        }
    }
    return rs;
}