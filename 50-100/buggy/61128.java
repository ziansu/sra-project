public void load() {
    java.io.File musicFile = new java.io.File(params.get("file"));
    com.lumitron.music.MusicService.musicPlayer = com.lumitron.music.MusicHandler.load(musicFile);
    java.lang.Long totalPlaybackInMicro = com.lumitron.music.MusicService.musicPlayer.getTotalPlaybackTime();
    java.lang.String totalPlaybackTime = convertTime(totalPlaybackInMicro);
    java.util.HashMap<java.lang.String, java.lang.Object> response = new java.util.HashMap<>();
    response.put("totalPlaybackTime", totalPlaybackTime);
    response.put("totalPlaybackInMicro", totalPlaybackInMicro.toString());
    com.lumitron.network.RequestHandler.send(serviceRoute.get("uuid"), response);
}