public static com.jordan30001.twitch.api.video.Video newVideoInstance(com.jordan30001.twitch.TwitchAPI api, org.json.JSONObject jsonObject) {
    try {
        return new com.jordan30001.twitch.api.video.Video(api, jsonObject);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}