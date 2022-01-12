public void onUriChange(android.net.Uri locationWithDateUri) {
    android.util.Log.v(LOG_TAG, "onUriChange");
    if (locationWithDateUri != null) {
        _locationWithDateUri = locationWithDateUri;
        if ((getLoaderManager()) == null) {
            android.util.Log.v(LOG_TAG, "onUriChange: null");
        }else {
            android.util.Log.v(LOG_TAG, "onUriChange: !null");
            getLoaderManager().restartLoader(LOADER_ID, null, this);
        }
    }
}