@java.lang.Override
public void onPause() {
    android.util.Log.d(org.openhab.habdroid.ui.OpenHABMainActivity.TAG, "onPause()");
    super.onPause();
    org.openhab.habdroid.ui.OpenHABMainActivity.mAsyncHttpClient.cancelAllRequests(true);
}