@org.junit.Test
public void execute() {
    dummyEso = new test.DummyESOWithEmptyMethod();
    dummyEso.exec();
    java.lang.Thread t1 = new java.lang.Thread(new test.SyncTest.Job1());
    t1.start();
    accessESO();
    try {
        t1.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}