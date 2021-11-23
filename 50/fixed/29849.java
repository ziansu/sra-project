@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (isBound) {
        unbindService(this);
        isBound = false;
    }
}