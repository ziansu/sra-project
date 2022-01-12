java.lang.String fetchData(java.lang.String url) throws java.io.IOException {
    com.squareup.okhttp.Request request = new com.squareup.okhttp.Request.Builder().url(url).build();
    com.squareup.okhttp.Response response = client.newCall(request).execute();
    return response.body().string();
}