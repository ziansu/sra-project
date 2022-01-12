@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((mGVRLayout) != null) {
        mGVRLayout.onResume();
    }
    setImmersiveSticky();
}