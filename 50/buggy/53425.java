public boolean cancel() {
    final java.lang.Runnable runnable = _commandRef.get();
    return _commandRef.compareAndSet(runnable, null);
}