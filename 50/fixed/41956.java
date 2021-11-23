private java.lang.String decode(java.lang.String aString) {
    java.lang.String string;
    try {
        return java.net.URLDecoder.decode(aString, "UTF-8");
    } catch (java.io.UnsupportedEncodingException details) {
        throw new java.lang.RuntimeException(details);
    }
}