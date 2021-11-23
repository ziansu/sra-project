@java.lang.Override
protected void onResume() {
    super.onResume();
    com.android.debug.hv.ViewServer.get(this).setFocusedWindow(this);
    buildAnim(this);
}