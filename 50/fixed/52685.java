@java.lang.Override
protected void onStop() {
    super.onStop();
    bits = null;
    java.lang.System.gc();
    mAesthetic2View.getThread().setRunning(false);
    java.lang.System.gc();
}