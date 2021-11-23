@java.lang.Override
protected void onResume() {
    super.onResume();
    mMapApiClient.setup();
    setUpMapIfNeeded();
    mCurrentPosition.apply();
    mPlaceDataManager.save();
}