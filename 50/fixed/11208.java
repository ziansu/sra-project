@java.lang.Override
public <T> java.util.concurrent.Callable<T> wrapCallable(final java.util.concurrent.Callable<T> callable) {
    return tracer.preserve(super.wrapCallable(callable));
}