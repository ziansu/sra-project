protected org.apache.http.client.utils.URIBuilder copyUriBuilder() {
    assert ((ub.getScheme()) != null) && ((ub.getHost()) != null);
    return new org.apache.http.client.utils.URIBuilder().setScheme(ub.getScheme()).setUserInfo(ub.getUserInfo()).setHost(ub.getHost()).setPort(ub.getPort()).setPath(ub.getPath()).setParameters(ub.getQueryParams());
}