public org.rxbooter.flow.Promise<T> notify(T value) {
    if (this.value.compareAndSet(null, value, false, true)) {
        while ((latch.getCount()) > 0) {
            latch.countDown();
        } 
        listeners.forEach(( c) -> notifyListener(c, value));
    }else {
        latch.countDown();
    }
    return this;
}