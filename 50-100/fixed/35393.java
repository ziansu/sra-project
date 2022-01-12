@java.lang.Override
public synchronized void addObserver(java.util.Observer o) {
    super.addObserver(o);
    for (java.util.function.Supplier<T> item : items) {
        o.update(this, item);
    }
    if (complete) {
        o.update(this, lew.bing.observable.Observe.STATUS.DONE);
    }
}