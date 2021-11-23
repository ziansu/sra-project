public <T> io.reactivex.Maybe<T> cache(java.lang.String key, io.reactivex.Maybe<T> maybe) {
    io.reactivex.Flowable<T> flowable = maybe.toFlowable();
    cache(key, flowable);
    return flowable.firstElement();
}