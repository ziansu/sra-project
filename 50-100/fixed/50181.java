@java.lang.Override
protected java.util.List<com.example.spotifystreamer.model.Artist> doInBackground(java.lang.String... params) {
    java.util.List<com.example.spotifystreamer.model.Artist> artists = null;
    if ((params.length) == 0) {
        return null;
    }
    java.lang.String jsonStringResult = com.example.spotifystreamer.utils.Utils.downloadJSONSearchResults(params[0]);
    if (jsonStringResult != null)
        artists = com.example.spotifystreamer.utils.Utils.parseJSONSearchResults(jsonStringResult);
    
    return artists;
}