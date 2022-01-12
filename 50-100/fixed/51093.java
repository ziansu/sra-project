public void edit(java.lang.String songName, java.lang.String newSongName, java.lang.String newSongURL) throws java.lang.Exception {
    if (!(this.playlistMap.containsKey(songName))) {
        throw new java.lang.Exception((("The song name being editted: " + songName) + " was not in the playlist."));
    }
    this.playlistMap.remove(songName);
    this.add(newSongName, newSongURL);
}