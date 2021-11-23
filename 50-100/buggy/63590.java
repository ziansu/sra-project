@java.lang.Override
public rx.Observable<java.lang.Float> call(java.lang.Long distance) {
    if (!(isMeaningfulWaypoint))
        return rx.Observable.just(speed);
    
    distanceAccumulated = getTripDistance.getDistanceAccumulated();
    lastTimeElapsed = (timeElapsed) - (lastTimeElapsed);
    getTripSpeed.setParams(getTripDistance.getLastDistance(), lastTimeElapsed, ((gpsConfig.getFastestInterval()) / 1000), gpsConfig.getDiscardSpeedsAbove());
    lastTimeElapsed = timeElapsed;
    return getTripSpeed.builtObservable();
}