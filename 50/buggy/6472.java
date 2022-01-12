@java.lang.Override
public void onMapBackgroundTouch() {
    raceListOverlay.unSetFocusedItem();
    mMapView.invalidate();
    raceVM.onMapBackgroundTouch();
}