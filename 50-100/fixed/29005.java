public void setReactShowUserLocation(boolean showUserLocation) {
    mShowUserLocation = showUserLocation;
    if ((mMap) != null) {
        if (((mLocationEngine) != null) && (!(mShowUserLocation))) {
            mLocationEngine.deactivate();
            return ;
        }
        enableLocationLayer();
    }
}