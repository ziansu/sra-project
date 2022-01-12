@java.lang.Override
public void onNext(T t) {
    if (done) {
        return ;
    }
    boolean b;
    try {
        b = predicate.test(t);
    } catch (java.lang.Throwable e) {
        done = true;
        s.cancel();
        reactivestreams.commons.util.ExceptionHelper.throwIfFatal(e);
        onError(reactivestreams.commons.util.ExceptionHelper.unwrap(e));
        subscriber.onError(e);
        return ;
    }
    if (!b) {
        done = true;
        s.cancel();
        reactivestreams.commons.publisher.PublisherAll.PublisherAllSubscriber.complete(false);
    }
}