public void addVideo(java.lang.String url, int episode) {
    java.lang.System.out.println(episode);
    playlist.add(new de.dieser1memesprech.proxsync.user.Video(url, episode));
    if ((playlist.size()) == 1) {
        updatePlaylistInfo(playlist.peek());
        if (!(playlist.isEmpty())) {
            setVideo(playlist.peek().url, playlist.peek().episode);
        }
    }
    sendPlaylist();
}