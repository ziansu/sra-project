public boolean cancel() {
    final java.lang.Runnable runnable = _commandRef.get();
    return (runnable != null) && (_commandRef.compareAndSet(runnable, null));
}