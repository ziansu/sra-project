private void waitForPlayer(java.lang.String source) {
    android.util.Log.i(LOG_TAG, ("waitForPlayer - start - source: " + source));
    try {
        callBackResultsCountDownLatch.await();
    } catch (java.lang.InterruptedException nothingCanBeDone) {
        android.widget.Toast.makeText(getApplicationContext().getApplicationContext(), getApplicationContext().getResources().getString(R.string.search_unsuccessful_internal_problems), Toast.LENGTH_LONG).show();
    }
    android.util.Log.i(LOG_TAG, ("waitForPlayer - end   - source: " + source));
}