public synchronized void raiseBroken() {
    if (broken) {
        return ;
    }
    event = true;
    broken = true;
    notifyAll();
    while ((!(peopleWaiting.isEmpty())) && (!(broken))) {
        try {
            this.wait();
        } catch (java.lang.InterruptedException ie) {
            java.lang.System.out.println("InterruptedException caught in LiftBarrier raiseBroken()");
        }
    } 
    event = false;
}