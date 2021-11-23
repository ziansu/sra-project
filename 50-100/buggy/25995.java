private java.lang.String get(java.lang.String url) throws java.io.IOException {
    okhttp3.Request request = new okhttp3.Request.Builder().url(url).build();
    com.codecool.android.neightbrotaxi.controller.Response response = com.codecool.android.neightbrotaxi.controller.APIController.client.newCall(request).execute();
    return response.body().string();
}