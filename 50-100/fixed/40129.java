@java.lang.Override
protected rx.Observable<com.depthguru.rxmap.overlay.tiles.MapTileBatch> postProcessData(rx.Observable<com.depthguru.rxmap.overlay.tiles.MapTileBatch> dataObservable) {
    if (completeProjectionWithPreviousTiles) {
        return super.postProcessData(dataObservable).lift(com.depthguru.rxmap.rx.StateMonad.create(MapTileBatch::completeWith));
    }else {
        return super.postProcessData(dataObservable);
    }
}