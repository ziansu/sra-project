public void showCorrectInfoWindow(com.google.android.gms.maps.model.LatLng destination) {
    if (!(mCurrentMarker.getPosition().equals(destination))) {
        mCurrentMarker.hideInfoWindow();
        if (doesMarkerExist(destination)) {
            findMarkerByLatLng(destination).showInfoWindow();
        }
    }
}