public java.lang.String encode(java.lang.String s) {
    try {
        return new java.lang.String(com.sun.org.apache.xml.internal.security.utils.Base64.encode(s.getBytes("UTF-8")));
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return s;
}