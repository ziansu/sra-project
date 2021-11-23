private io.reactivex.Observable<?> oneOf(io.reactivex.Observable<?> trigger, io.reactivex.Observable<?> pending) {
    if (trigger == null) {
        return io.reactivex.Observable.just(null);
    }
    return io.reactivex.Observable.merge(trigger, pending);
}