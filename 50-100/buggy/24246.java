@java.lang.Override
public rx.Observable<java.lang.Float> call(java.lang.Float distance) {
    lastLocation = meaningfulUpdatesLocation.getCurrentLocation();
    long currentTime = (java.lang.System.currentTimeMillis()) / 1000;
    if ((timeLastLocation) == 0)
        timeLastLocation = currentTime;
    
    timeLastLocation = currentTime - (timeLastLocation);
    getTripSpeed.setParams(distance.longValue(), timeLastLocation, ((gpsConfig.getFastestInterval()) / 1000), gpsConfig.getDiscardSpeedsAbove());
    timeLastLocation = currentTime;
    return getTripSpeed.builtObservable();
}