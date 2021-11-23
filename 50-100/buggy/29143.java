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
        s.cancel();
        rsc.util.ExceptionHelper.throwIfFatal(e);
        onError(rsc.util.ExceptionHelper.unwrap(e));
        return false;
    }
    if (b) {
        actual.onNext(t);
        return true;
    }
    return false;
}