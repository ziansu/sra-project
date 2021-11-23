private void updateLocation(android.location.Location location) {
    if (location == null) {
        locationUpdateTimestamp = android.os.SystemClock.elapsedRealtime();
        return ;
    }
    if (((locationLayerMode) == (LocationLayerMode.NAVIGATION)) || ((locationLayerMode) == (LocationLayerMode.LOCKED_NAVIGATION))) {
        bearingChangeAnimate(location.getBearing());
    }else {
        setAccuracy(location);
    }
    setLocation(location);
}