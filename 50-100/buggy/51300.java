java.lang.String run(java.lang.String url) throws java.io.IOException {
    okhttp3.HttpUrl.Builder urlBuilder = okhttp3.HttpUrl.parse(url).newBuilder();
    urlBuilder.addQueryParameter("d", date).build();
    url = urlBuilder.toString();
    android.util.Log.d("url : ", url);
    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
    okhttp3.Response response = client.newCall(request).execute();
    return response.body().string();
}