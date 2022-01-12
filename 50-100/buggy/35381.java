public void attend(java.util.concurrent.locks.Lock lock) {
    try {
        rai.leaveRai(this);
        lock.unlock();
        java.lang.Thread.sleep(2000);
        java.lang.System.out.println(((this) + " has left the rai"));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}