public static rx.Observable<java.lang.Boolean> createObservable(android.app.Activity ctx, com.google.android.gms.location.LocationRequest locationRequest) {
    return rx.Observable.create(new pl.charmas.android.reactivelocation.observables.location.LocationSettingsObservable(ctx, locationRequest));
}