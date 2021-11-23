public static java.lang.String encodeURL(java.lang.String url) {
    try {
        return null == url ? StringPool.BLANK : java.net.URLEncoder.encode(url, com.liferay.util.SystemProperties.get(com.liferay.util.Http.FILE_ENCODING));
    } catch (java.io.UnsupportedEncodingException uee) {
        com.dotmarketing.util.Logger.error(com.liferay.util.Http.class, uee.getMessage(), uee);
        return StringPool.BLANK;
    }
}