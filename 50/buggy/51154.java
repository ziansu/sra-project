public void attendiTredici() throws java.lang.InterruptedException {
    concurrent.LockManager.lockTredici.lock();
    while (concurrent.LockManager.inAttesaZero) {
        java.lang.System.out.println("AttendoTredici");
        concurrent.LockManager.conditionTredici.await();
    } 
    java.lang.System.out.println("RiprendoTredici");
    concurrent.LockManager.inAttesaTredici = true;
    concurrent.LockManager.lockTredici.unlock();
}