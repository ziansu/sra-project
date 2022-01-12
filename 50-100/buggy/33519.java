private void execute() {
    dummyEso = new test.DummyESOWithEmptyMethod();
    dummyEso.exec();
    java.lang.Thread t1 = new java.lang.Thread(new test.LockTest.Job1());
    t1.start();
    synchronized(lock) {
        dummyEso.exec();
    }
    try {
        t1.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}