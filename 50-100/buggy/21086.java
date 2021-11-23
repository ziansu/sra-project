@java.lang.Override
public void onError(java.lang.Throwable e) {
    rx.plugins.RxJavaHooks.onError(e);
    if (done) {
        return ;
    }
    done = true;
    try {
        actual.onError(e);
    } catch (java.lang.Throwable ex) {
        rx.observers.Exceptions.throwIfFatal(ex);
        throw new rx.observers.OnErrorFailedException(new rx.observers.CompositeException(e, ex));
    }
}