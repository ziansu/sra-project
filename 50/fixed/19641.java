@java.lang.Override
protected void onPause() {
    super.onPause();
    controller.stop();
}