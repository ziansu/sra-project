@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((mfragment) != null) {
        mfragment.refreshData();
    }
}