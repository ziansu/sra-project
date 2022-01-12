@java.lang.Override
protected void onDestroy() {
    syncTimerTask.cancel();
    super.onDestroy();
}