protected org.apache.http.client.utils.URIBuilder copyUriBuilder() {
    return new org.apache.http.client.utils.URIBuilder().setScheme(ub.getScheme()).setUserInfo(ub.getUserInfo()).setHost(ub.getHost()).setPort(ub.getPort()).setPath(ub.getPath()).setParameters(ub.getQueryParams());
}