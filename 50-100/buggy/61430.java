@java.lang.Override
public void setCharacterEncoding(java.lang.String charset) {
    if (isCommitted()) {
        return ;
    }
    if (included) {
        return ;
    }
    if (usingWriter) {
        return ;
    }
    try {
        getCoyoteResponse().setCharset(org.apache.tomcat.util.buf.B2CConverter.getCharset(charset));
    } catch (java.io.UnsupportedEncodingException e) {
        org.apache.catalina.connector.Response.log.warn(org.apache.catalina.connector.Response.sm.getString("coyoteResponse.encoding.invalid", charset), e);
        return ;
    }
    isCharacterEncodingSet = true;
}