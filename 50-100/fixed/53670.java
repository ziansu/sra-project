@java.lang.Override
public void onCompleted(java.lang.Exception e, com.google.gson.JsonObject result) {
    try {
        com.zandyl.slidepuzzle.RedditResponse response = new com.google.gson.Gson().fromJson(result, com.zandyl.slidepuzzle.RedditResponse.class);
        java.lang.String url = response.data.children[3].data.preview.images[0].source.url;
        downloadPicFromUrl(url);
    } catch (java.lang.Exception exception) {
    }
}