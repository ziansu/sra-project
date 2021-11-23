public void setReactShowUserLocation(boolean showUserLocation) {
    mShowUserLocation = showUserLocation;
    if ((mLocationEngine) != null) {
        if (!(mShowUserLocation)) {
            mLocationEngine.deactivate();
            return ;
        }
        if ((mMap) != null) {
            enableLocationLayer();
        }
    }
}