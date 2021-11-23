private static de.terrestris.shogun2.util.model.Response postBody(org.apache.http.client.methods.HttpPost httpRequest, java.lang.String body, org.apache.http.entity.ContentType contentType, java.lang.String username, java.lang.String password) throws java.net.URISyntaxException, org.apache.http.HttpException {
    org.apache.http.entity.StringEntity stringEntity = new org.apache.http.entity.StringEntity(body, contentType);
    stringEntity.setChunked(true);
    httpRequest.setEntity(stringEntity);
    return de.terrestris.shogun2.util.http.HttpUtil.send(httpRequest, null, null);
}