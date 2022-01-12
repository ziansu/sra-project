public static java.lang.String formatQueryString(java.lang.String url, java.lang.String field, java.lang.String value) {
    if (org.apache.commons.lang.StringUtils.isBlank(value)) {
        return url;
    }
    return url.contains("?") ? (("&" + field) + "=") + value : (("?" + field) + "=") + value;
}