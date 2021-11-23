@java.lang.SuppressWarnings(value = { "WeakerAccess" , "unused" })
public io.reactivex.Observable<com.vise.xsnow.permission.Permission> requestEach(final java.lang.String... permissions) {
    return io.reactivex.Observable.just(null).compose(ensureEach(permissions));
}