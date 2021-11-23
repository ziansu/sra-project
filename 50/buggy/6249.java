@java.lang.Override
public io.reactivex.ObservableSource<?> apply(@io.reactivex.annotations.NonNull
io.reactivex.Observable<java.lang.Object> objectObservable) throws java.lang.Exception {
    return shouldRepeat ? objectObservable.delay(30, java.util.concurrent.TimeUnit.SECONDS) : objectObservable;
}