@java.lang.Override
protected void onPause() {
    if (isBound) {
        isBound = false;
        unbindService(this);
    }
    super.onPause();
}