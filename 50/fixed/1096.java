@java.lang.Override
protected void onDestroy() {
    DedicatedStatics.launched = null;
    super.onDestroy();
}