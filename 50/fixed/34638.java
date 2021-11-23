@java.lang.Override
protected void onPause() {
    super.onPause();
    smanager.unregisterListener(this);
    unbindService(songConnection);
}