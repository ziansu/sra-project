private okhttp3.Response givenUnauthorizedServerResponse(okhttp3.Request request) {
    return new okhttp3.Response.Builder().body(okhttp3.ResponseBody.create(okhttp3.MediaType.parse("text/plain"), "Unauthorized")).request(request).protocol(Protocol.HTTP_1_1).code(java.net.HttpURLConnection.HTTP_UNAUTHORIZED).header("WWW-Authenticate", "Basic realm=\"myrealm\"").build();
}