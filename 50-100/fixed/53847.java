public com.jordan30001.twitch.api.video.Video newVideoInstance(java.lang.String id) {
    try {
        com.jordan30001.twitch.utils.HTTPSClient.URLData urlData = com.jordan30001.twitch.utils.HTTPSClient.getURLData(java.lang.String.format("%s/videos/%s", api.getBaseURL(), id), "", "", "", 200, 404);
        return new com.jordan30001.twitch.api.video.Video(api, urlData.getJSONObject());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}