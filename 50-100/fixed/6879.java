private java.lang.String getPlaylist() {
    int entryCount = java.lang.Integer.parseInt(getConfiguration().getProperty("playlist.entry.count"));
    java.lang.StringBuilder playlist = new java.lang.StringBuilder();
    for (int i = 1; i < entryCount; i++) {
        playlist.append(i);
        playlist.append("/ ");
        playlist.append(getConfiguration().getProperty(("playlist.entry.name." + i)));
        playlist.append("\n");
    }
    return playlist.toString();
}