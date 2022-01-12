public static java.lang.String URLDecode(java.lang.String str, java.nio.charset.Charset charset) {
    return org.apache.tomcat.util.buf.UDecoder.URLDecode(str, charset, false);
}