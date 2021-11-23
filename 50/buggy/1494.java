private void restartLoader() {
    android.util.Log.v(LOG_TAG, "restarting loader");
    getSupportLoaderManager().restartLoader(LOCATION_LOADER_ID, null, this);
}