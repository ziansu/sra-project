@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((mAdapter) != null) {
        mAdapter.disableForegroundDispatch(this);
    }
}