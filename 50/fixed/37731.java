@java.lang.Override
protected void onDestroy() {
    nativeFinalize();
    super.onDestroy();
}