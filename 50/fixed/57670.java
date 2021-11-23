@android.support.annotation.NonNull
public <T> rx.Observable<T> toObservable(final java.lang.Class<T> type) {
    return subject.ofType(type);
}