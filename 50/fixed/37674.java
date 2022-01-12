@java.lang.Override
protected void onDestroy() {
    this.unregisterReceiver(finishActivity);
    android.util.Log.i(GLOBAL_TRACK_LOG, ((LOG_TAG_ACTIVITY) + "Stopped service"));
    super.onDestroy();
}