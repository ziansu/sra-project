@java.lang.Override
public void run() {
    for (int j = 0; j < 1000; j++) {
        de.caluga.test.mongo.suite.data.UncachedObject uc = new de.caluga.test.mongo.suite.data.UncachedObject();
        uc.setCounter(((t * 100) + j));
        uc.setValue(("By thread " + t));
        m.store(uc);
    }
}