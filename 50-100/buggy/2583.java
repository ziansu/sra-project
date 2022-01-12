private static Response.ResponseBuilder noCache(final javax.ws.rs.core.Response.ResponseBuilder response) {
    final javax.ws.rs.core.CacheControl cacheControl = new javax.ws.rs.core.CacheControl();
    cacheControl.setPrivate(true);
    cacheControl.setMaxAge(0);
    cacheControl.setMustRevalidate(true);
    response.cacheControl(cacheControl);
    return response;
}