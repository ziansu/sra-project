public boolean isActive() {
    io.reactivex.processors.PublishProcessor<com.github.mproberts.rxtools.types.Optional<T>> next = _next.get();
    if (next != null) {
        return true;
    }
    io.reactivex.processors.PublishProcessor<com.github.mproberts.rxtools.types.Optional<T>> previous = _previous.get();
    return previous != null;
}