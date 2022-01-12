public void onLocationChanged() {
    updateWeather();
    getLoaderManager().restartLoader(CURSOR_LOADER_ID, null, this);
}