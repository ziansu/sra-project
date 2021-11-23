private com.github.kevinsawicki.http.HttpRequest prepareApiDeleteRequest(java.lang.String apiPath, java.util.Map<java.lang.String, ?> params) throws com.github.kevinsawicki.http.HttpRequest.HttpRequestException {
    com.github.kevinsawicki.http.HttpRequest req = com.github.kevinsawicki.http.HttpRequest.delete(((account.server) + apiPath), params, false).followRedirects(true).connectTimeout(com.seafile.seadroid2.SeafConnection.CONNECTION_TIMEOUT);
    req.header("Authorization", ("Token " + (account.token)));
    return prepareHttpsCheck(req);
}