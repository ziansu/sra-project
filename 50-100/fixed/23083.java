public org.rxbooter.flow.Promise<T> notify(T value) {
    if (this.value.compareAndSet(null, value, false, true)) {
        if ((listeners.size()) > 0) {
            listeners.forEach(( c) -> org.rxbooter.flow.Promise.notifyListener(c, value));
        }
        while ((latch.getCount()) > 0) {
            latch.countDown();
        } 
    }else {
        latch.countDown();
    }
    return this;
}