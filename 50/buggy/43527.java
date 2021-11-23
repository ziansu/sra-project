public static java.lang.String URLDecode(java.lang.String str, java.nio.charset.Charset charset) {
    if (str == null) {
        return null;
    }
    return org.apache.tomcat.util.buf.UDecoder.URLDecode(str.getBytes(java.nio.charset.StandardCharsets.US_ASCII), charset, false);
}