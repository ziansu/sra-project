@java.lang.Override
protected void onPause() {
    super.onPause();
    pause = true;
    countDown.cancel();
    countDown = null;
}