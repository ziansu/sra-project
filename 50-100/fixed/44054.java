public static java.lang.String escapeQSValue(java.lang.String str) {
    if (!(railo.runtime.net.http.ReqRspUtil.needEncoding(str, true)))
        return str;
    
    railo.runtime.config.Config config = railo.runtime.engine.ThreadLocalPageContext.getConfig();
    if (config != null) {
        try {
            return railo.commons.net.URLEncoder.encode(str, config.getWebCharset());
        } catch (java.io.UnsupportedEncodingException e) {
        }
    }
    return railo.commons.net.URLEncoder.encode(str);
}