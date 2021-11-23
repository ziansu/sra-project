public void addVideo(java.lang.String url) {
    playlist.add(new de.dieser1memesprech.proxsync.user.Video(url));
    if ((playlist.size()) == 1) {
        updatePlaylistInfo(playlist.peek());
        if (!(playlist.isEmpty())) {
            java.lang.System.out.println(playlist.peek().episode);
            setVideo(playlist.peek().url, playlist.peek().episode);
        }
    }
    sendPlaylist();
}