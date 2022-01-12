public boolean isActive() {
    io.reactivex.processors.PublishProcessor<com.github.mproberts.rxtools.types.Optional<T>> next = null;
    if ((_next) != null) {
        next = _next.get();
    }
    if (next != null) {
        return true;
    }
    io.reactivex.processors.PublishProcessor<com.github.mproberts.rxtools.types.Optional<T>> previous = null;
    if ((_previous) != null) {
        previous = _previous.get();
    }
    return previous != null;
}