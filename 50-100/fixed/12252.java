public static java.util.Map<java.lang.String, java.lang.Object> sendRequest(java.lang.String subUrl, java.lang.String gid) throws java.io.IOException {
    java.lang.StringBuilder url = new java.lang.StringBuilder(com.paypal.musictag.dao.usingwebservice.api.CoverArtArchiveAPI.URL).append(subUrl).append(gid);
    java.net.URL requestUrl = new java.net.URL(url.toString());
    java.lang.String json = com.paypal.musictag.util.MusicTagUtil.getJsonFromURL(requestUrl);
    return com.paypal.musictag.util.MusicTagUtil.jsontoMap(json);
}