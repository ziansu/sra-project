@java.lang.Override
protected void onPause() {
    mUpdateThread.requestStop();
    mUpdateThread = null;
    mUIRefreshHandler.removeCallbacks(null);
    mUIRefreshHandler = null;
    mForeFlightClient.stopClient();
    mForeFlightClient = null;
    super.onPause();
}