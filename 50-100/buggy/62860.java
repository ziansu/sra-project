@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.e(TAG, "Stop timer task");
    timerHandler.removeCallbacks(runPlayStatusCheck);
    timerHandler.removeCallbacks(runAutoSetUserSelected);
    timerHandler.removeCallbacks(runUpdateBackgroundImage);
    progressDialog.dismiss();
    android.util.Log.e(TAG, "TrackPlayer Has been destroyed");
}