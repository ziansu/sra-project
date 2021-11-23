@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.android.debug.hv.ViewServer.get(this).removeWindow(this);
}