private java.lang.String trimPropertyName(java.lang.String propName) {
    if ((propName.length()) > ((NhincConstants.CUSTOM_HTTP_HEADERS.length()) + 1)) {
        return propName.substring(((NhincConstants.CUSTOM_HTTP_HEADERS.length()) + 1)).trim();
    }else {
        return null;
    }
}