public java.lang.RuntimeException handleHttpException(org.sonar.api.utils.HttpDownloader.HttpException he) {
    if ((he.getResponseCode()) == 401) {
        return new java.lang.IllegalStateException(java.lang.String.format(getMessageWhenNotAuthorized(), CoreProperties.LOGIN, CoreProperties.PASSWORD), he);
    }
    if ((he.getResponseCode()) == 403) {
        return new java.lang.IllegalStateException(org.sonar.batch.bootstrap.ServerClient.tryParseAsJsonError(he.getResponseContent()), he);
    }
    return new java.lang.IllegalStateException(java.lang.String.format("Fail to execute request [code=%s, url=%s]", he.getResponseCode(), he.getUri()), he);
}