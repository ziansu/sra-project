private void onResponseSuccess(com.igorko.accesibleif.models.Data response) {
    mElementList = response.getElements();
    java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> markerList = com.igorko.accesibleif.utils.MarkerUtils.getInstance().getAllMarkers(mElementList, mZoomLevel);
    com.igorko.accesibleif.utils.MarkerUtils.getInstance().addMarkers(mMap, markerList);
    if ((mMyLocation) != null) {
        displayLocation(mMyLocation);
    }
    hideProgress();
}