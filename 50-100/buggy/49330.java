public ch.viascom.groundwork.foxhttp.FoxHttpResponse execute(ch.viascom.groundwork.foxhttp.FoxHttpClient foxHttpClient) throws ch.viascom.groundwork.foxhttp.exception.FoxHttpException {
    foxHttpClient.getFoxHttpLogger().log("========= Request =========");
    verifyRequest();
    foxHttpClient.getFoxHttpLogger().log((("setFoxHttpClient(" + foxHttpClient) + ")"));
    this.foxHttpClient = foxHttpClient;
    return executeHttp("https".equals(url.getProtocol()));
}