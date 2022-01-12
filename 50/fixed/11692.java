@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    myOrientationEventListener.disable();
}