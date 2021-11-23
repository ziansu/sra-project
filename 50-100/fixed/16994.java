public Response.Status getURLResponseStatus(java.net.URL url) {
    javax.ws.rs.core.Response cached = com.sciamlab.common.util.HTTPClient.urlCacheStatus.getIfPresent(url);
    if (cached != null)
        return Response.Status.fromStatusCode(cached.getStatus());
    
    javax.ws.rs.core.Response r = this.doHEAD(url);
    com.sciamlab.common.util.HTTPClient.urlCacheStatus.put(url, r);
    return Response.Status.fromStatusCode(r.getStatus());
}