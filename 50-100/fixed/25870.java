protected static java.lang.String decodePercent(java.lang.String str) {
    java.lang.String decoded = null;
    try {
        decoded = java.net.URLDecoder.decode(str, "UTF8");
    } catch (java.io.UnsupportedEncodingException ignored) {
        com.wade.webserver.NanoHTTPD.LOG.log(java.util.logging.Level.WARNING, "Encoding not supported, ignored", ignored);
    }
    return decoded;
}