@java.lang.Override
public boolean tryOnNext(T t) {
    if (done) {
        rsc.util.UnsignalledExceptions.onNextDropped(t);
        return false;
    }
    boolean b;
    try {
        b = predicate.test(t);
    } catch (java.lang.Throwable e) {
        rsc.util.ExceptionHelper.throwIfFatal(e);
        s.cancel();
        onError(rsc.util.ExceptionHelper.unwrap(e));
        return false;
    }
    if (b) {
        return actual.tryOnNext(t);
    }
    return false;
}