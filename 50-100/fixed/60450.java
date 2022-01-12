@org.junit.Test
public void execute() {
    dummyEso = new test.DummyESOWithEmptyMethod();
    dummyEso.exec();
    java.lang.Thread t1 = new java.lang.Thread(new test.UnsyncTest.Job1());
    t1.start();
    dummyEso.exec();
    try {
        t1.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}