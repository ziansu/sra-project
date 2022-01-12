@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    if (!(response.isSuccessful()))
        throw new java.io.IOException(("Unexpected code " + response));
    
    final java.util.regex.Matcher matcher = pattern2.matcher(response.body().string());
    if (matcher.find()) {
        loadedHtml = matcher.group(1);
        if ((loadedHtml) == null) {
            loadedHtml = matcher.group(2);
        }
    }
    parseHtmlTest(loadedHtml);
}