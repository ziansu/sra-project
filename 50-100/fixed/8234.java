@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    if (!(response.isSuccessful()))
        throw new java.io.IOException(("Unexpected code " + response));
    
    loadedHtml = response.body().string();
    parseHtmlTest(loadedHtml);
}