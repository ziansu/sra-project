@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((assetViewed) || (locViewed)) {
        hideScannedData();
        assetViewed = false;
        locViewed = false;
    }
}