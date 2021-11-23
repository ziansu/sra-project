@java.lang.Override
protected void onStart() {
    if ((photoListAdapter) != null) {
        registerReceiver();
    }
    super.onStart();
}