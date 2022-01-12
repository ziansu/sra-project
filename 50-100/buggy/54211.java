@org.junit.Test
public void testAdapterLogsNext() throws java.lang.Exception {
    testNext("testTemplate1", "mapreduce", "testMapReduce1", true, MockLogReader.TEST_NAMESPACE, "testAdapter1");
    try {
        testNext("testTemplate1", "mapreduce", "testMapReduce1", true, Constants.DEFAULT_NAMESPACE, "testAdapter1");
        org.junit.Assert.fail();
    } catch (java.lang.AssertionError e) {
    }
    testNextNoMax("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    testNextFilter("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    testNextNoFrom("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
}