public static rx.Observable<java.lang.Boolean> createObservable(android.content.Context ctx, com.google.android.gms.location.LocationRequest locationRequest) {
    return rx.Observable.create(new pl.charmas.android.reactivelocation.observables.location.LocationSettingsObservable(ctx, locationRequest, false));
}