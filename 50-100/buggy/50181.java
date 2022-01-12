@java.lang.Override
protected java.util.List<com.example.spotifystreamer.model.Artist> doInBackground(java.lang.String... params) {
    if (((params.length) == 0) || (params[0].equals(""))) {
        android.util.Log.d(com.example.spotifystreamer.activities.MainActivityFragment.LOG_TAG, "No query submitted");
        return null;
    }
    java.lang.String jsonStringResult = com.example.spotifystreamer.utils.Utils.downloadJSONSearchResults(params[0]);
    java.util.List<com.example.spotifystreamer.model.Artist> artists = null;
    if (jsonStringResult != null)
        artists = com.example.spotifystreamer.utils.Utils.parseJSONSearchResults(jsonStringResult);
    
    return artists;
}