@java.lang.Override
protected void onStop() {
    super.onStop();
    getLoaderManager().destroyLoader(com.example.android.quakereport.EarthquakeActivity.EARTHQUAKE_LOADER_ID);
    android.util.Log.e(com.example.android.quakereport.EarthquakeActivity.LOG_TAG, "Earthquake Activity stopped");
}