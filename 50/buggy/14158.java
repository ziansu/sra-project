protected void onPostExecute(java.util.ArrayList<com.uwo.crystalli.jukebox.VideoResult> videos) {
    mSearchResultsAdapter.clear();
    if (videos != null)
        android.util.Log.v(LOG_TAG, videos.toString());
    
    mSearchResultsAdapter.addAll(videos);
}