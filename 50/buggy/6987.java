public void attendiSette() throws java.lang.InterruptedException {
    concurrent.LockManager.lockSette.lock();
    while (concurrent.LockManager.inAttesaSette) {
        java.lang.System.out.println("AttendoSette");
        concurrent.LockManager.conditionSette.await();
    } 
    java.lang.System.out.println("RiprendoSette");
    concurrent.LockManager.inAttesaSette = true;
    concurrent.LockManager.lockSette.unlock();
}