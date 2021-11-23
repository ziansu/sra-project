public Response.Status getURLResponseStatus(java.net.URL url) throws javax.ws.rs.core.UriBuilderException {
    java.lang.Integer cached = com.sciamlab.common.util.HTTPClient.urlCacheStatus.getIfPresent(url);
    if (cached != null)
        return Response.Status.fromStatusCode(cached);
    
    javax.ws.rs.core.Response r = this.doHEAD(url);
    com.sciamlab.common.util.HTTPClient.urlCacheStatus.put(url, r.getStatus());
    return Response.Status.fromStatusCode(r.getStatus());
}