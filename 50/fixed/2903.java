public java.lang.String decode(java.lang.String s) {
    try {
        return new java.lang.String(com.sun.org.apache.xml.internal.security.utils.Base64.decode(s));
    } catch (com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException e) {
    }
    return s;
}