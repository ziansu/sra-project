@java.lang.Override
protected void onDestroy() {
    listener.turnOffFlash(this);
    super.onDestroy();
}