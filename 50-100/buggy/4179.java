@java.lang.Deprecated
public static java.lang.String URLDecode(byte[] bytes, java.lang.String enc, boolean isQuery) {
    java.nio.charset.Charset charset = null;
    if (enc != null) {
        try {
            charset = org.apache.tomcat.util.buf.B2CConverter.getCharset(enc);
        } catch (java.io.UnsupportedEncodingException uee) {
            if (org.apache.tomcat.util.buf.UDecoder.log.isDebugEnabled()) {
                org.apache.tomcat.util.buf.UDecoder.log.debug(org.apache.tomcat.util.buf.UDecoder.sm.getString("uDecoder.urlDecode.uee", enc), uee);
            }
        }
    }
    return org.apache.tomcat.util.buf.UDecoder.URLDecode(bytes, charset, isQuery);
}