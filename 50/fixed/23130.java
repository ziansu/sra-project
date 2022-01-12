private javax.ws.rs.core.Response.ResponseBuilder setHeaders(javax.ws.rs.core.Response.ResponseBuilder responseBuilder) {
    responseBuilder.header("Access-Control-Allow-Origin", "*");
    responseBuilder.header("Pragma", "no-cache");
    responseBuilder.header("Cache-Control", "no-cache");
    responseBuilder.header("Expires", 0);
    return responseBuilder;
}