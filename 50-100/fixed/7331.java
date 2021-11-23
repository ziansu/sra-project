@java.lang.Override
public void lock() {
    if (((reentrant) != null) && (reentrant.isSame())) {
        reentrant.acquire();
    }else {
        while (!(cas.compareAndSet(false, true))) {
            waitForSignal();
        } 
        reentrant = new org.arivu.utils.lock.Reentrant();
    }
}