@org.junit.Test(expected = java.lang.IllegalStateException.class)
public void testStopStoppedRecord() {
    record.start();
    timeout();
    long start = getStartFieldValue().getTime();
    record.stop();
    timeout();
    record.stop();
    long end = getEndFieldValue().getTime();
    org.junit.Assert.assertTrue((end > start));
}