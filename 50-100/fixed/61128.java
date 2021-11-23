public void load() {
    java.util.HashMap<java.lang.String, java.lang.Object> response = new java.util.HashMap<>();
    java.lang.Long totalPlaybackInMicro = com.lumitron.music.MusicHandler.load(params.get("file"));
    response.put("totalPlaybackTime", convertTime(totalPlaybackInMicro));
    response.put("totalPlaybackInMicro", totalPlaybackInMicro.toString());
    com.lumitron.network.RequestHandler.send(serviceRoute.get("uuid"), response);
}