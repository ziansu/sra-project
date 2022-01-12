@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    if (!result) {
        synchronized(fi.lbd.mobile.fragments.ObjectListFragment.LOCK) {
            android.util.Log.d("________", "Couldn't connect to locationclient. Releasing lock.");
            fi.lbd.mobile.fragments.ObjectListFragment.searchInProgress = false;
            statusText.setText(LOCATION_FAILED);
            lastStatusText = LOCATION_FAILED;
            lastStatusBackground = LOCATION_BACKGROUND;
        }
    }
}