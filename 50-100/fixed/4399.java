public static java.lang.String formatQueryString(java.lang.String url, java.lang.String field, java.lang.Boolean value) {
    if (null == value) {
        return url;
    }
    return url + (url.contains("?") ? (("&" + field) + "=") + value : (("?" + field) + "=") + value);
}