@java.lang.Override
public void onComplete() {
    reactor.core.publisher.FluxWindowPredicate.WindowGroupedFlux<T> g = window;
    if (g != null) {
        g.onComplete();
    }
    window = null;
    done = true;
    drain();
}