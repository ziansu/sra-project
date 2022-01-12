private void initObserverIfNull() {
    if (!(hasObserver())) {
        setObserver(new com.github.rovkinmax.rxretainexample.EmptySubscriber<T>());
    }
}