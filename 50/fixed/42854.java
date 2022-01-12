@java.lang.Override
protected void onPause() {
    beaconManager.stopRanging(welten);
    mCardScroller1.deactivate();
    super.onPause();
}