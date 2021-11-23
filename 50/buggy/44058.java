@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    android.util.Log.d(com.example.android.quakereport.EarthquakeActivity.TAG, "Inside onPreExecute() in main...");
    earthquakeListView.setVisibility(View.GONE);
    reloadButton.setVisibility(View.GONE);
    progressBar.setVisibility(View.VISIBLE);
    textView.setVisibility(View.VISIBLE);
}