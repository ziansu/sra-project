public ch.viascom.groundwork.foxhttp.FoxHttpResponse execute(ch.viascom.groundwork.foxhttp.FoxHttpClient foxHttpClient) throws ch.viascom.groundwork.foxhttp.exception.FoxHttpException {
    verifyRequest();
    foxHttpClient.getFoxHttpLogger().log("========= Request =========");
    foxHttpClient.getFoxHttpLogger().log((("setFoxHttpClient(" + foxHttpClient) + ")"));
    this.foxHttpClient = foxHttpClient;
    return executeHttp("https".equals(url.getProtocol()));
}