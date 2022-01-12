@org.junit.Test(expected = java.lang.IllegalStateException.class)
public void testStopStoppedRecord() {
    record.start();
    timeout();
    record.stop();
    timeout();
    record.stop();
    long end = getEndFieldValue().getTime();
    long start = getStartFieldValue().getTime();
    org.junit.Assert.assertTrue((end > start));
}