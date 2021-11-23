private static org.apache.http.HttpEntity entityFromOkHttpResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    org.apache.http.entity.BasicHttpEntity entity = new org.apache.http.entity.BasicHttpEntity();
    com.squareup.okhttp.ResponseBody body = response.body();
    entity.setContent(body.byteStream());
    entity.setContentLength(body.contentLength());
    entity.setContentEncoding(response.header("Content-Encoding"));
    entity.setContentType(body.contentType().type());
    return entity;
}