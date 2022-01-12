private void checkError(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> t) {
    if ((t.get()) != null) {
        throw com.google.common.base.Throwables.propagate(t.get());
    }
}