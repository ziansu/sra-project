synchronized void wakeupAll() {
    while (!(continuations.isEmpty())) {
        org.apache.cxf.continuations.Continuation c = continuations.remove(0);
        c.resume();
    } 
    notifyAll();
}