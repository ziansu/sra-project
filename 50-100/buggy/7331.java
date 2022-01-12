@java.lang.Override
public void lock() {
    if (((reentrant) != null) && (reentrant.isSame())) {
        reentrant.acquire();
        java.lang.System.out.println("Rentrant acquire!");
    }else {
        while (!(cas.compareAndSet(false, true))) {
            waitForSignal();
        } 
        reentrant = new org.arivu.utils.lock.Reentrant();
        java.lang.System.out.println("Rentrant created!");
    }
}