protected java.lang.Void doInBackground(java.lang.Void... unused) {
    java.util.Map<java.lang.String, java.lang.Object> body = new java.util.HashMap<>();
    body.put("range_start", start);
    body.put("insert_before", end);
    if (end > (-1)) {
        com.reissgrvs.spotifyplaylisttool.SpotifyAPI.SpotifyAPIManager.getService().reorderPlaylistTracks(userID, playlistID, body);
    }
    return null;
}