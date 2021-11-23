@java.lang.Override
protected void onStop() {
    super.onDestroy();
    mp.stop();
}