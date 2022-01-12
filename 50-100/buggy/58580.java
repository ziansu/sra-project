@org.junit.Test
public void testAdapterLogsPrev() throws java.lang.Exception {
    testPrev("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    testPrevNoMax("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    try {
        testPrevNoMax("testTemplate1", "mapreduce", "testMapReduce1", Constants.DEFAULT_NAMESPACE, "testAdapter1");
        org.junit.Assert.fail();
    } catch (java.lang.AssertionError e) {
    }
    testPrevFilter("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    testPrevNoFrom("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
}