@java.lang.Override
public void onComplete() {
    reactor.core.publisher.FluxWindowPredicate.WindowGroupedFlux<T> g = window;
    if (g != null) {
        g.onComplete();
    }
    window = null;
    reactor.core.publisher.FluxWindowPredicate.WindowPredicateMain.GROUP_COUNT.decrementAndGet(this);
    done = true;
    drain();
}