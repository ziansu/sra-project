private org.json.JSONArray getPlaylists() {
    java.lang.String get = "SELECT * FROM " + (DBTables.Playlist);
    org.json.JSONArray playlists = query(get);
    for (int i = 0; i < (playlists.length()); i++) {
        playlists.getJSONObject(i).put("entries", getPlaylist(playlists.getJSONObject(i).getInt(DBAttributes.PLAYLIST_ID)).length());
    }
    return query(get);
}