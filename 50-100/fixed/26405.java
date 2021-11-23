public void showCorrectInfoWindow(com.google.android.gms.maps.model.LatLng destination) {
    if ((mCurrentMarker) == null)
        return ;
    
    if (mCurrentMarker.getPosition().equals(destination))
        return ;
    
    mCurrentMarker.hideInfoWindow();
    if (doesMarkerExist(destination))
        findMarkerByLatLng(destination).showInfoWindow();
    
}