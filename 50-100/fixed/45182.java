private io.reactivex.Observable<?> pending(final java.lang.String... permissions) {
    for (java.lang.String p : permissions) {
        if (!(mRxPermissionsFragment.containsByPermission(p))) {
            return io.reactivex.Observable.empty();
        }
    }
    return io.reactivex.Observable.just(new java.lang.Object());
}