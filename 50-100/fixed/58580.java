@org.junit.Test
public void testAdapterLogsPrev() throws java.lang.Exception {
    testPrev("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    testPrevNoMax("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    testPrevFilter("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    testPrevNoFrom("testTemplate1", "mapreduce", "testMapReduce1", MockLogReader.TEST_NAMESPACE, "testAdapter1");
    try {
        testPrevNoMax("testTemplate1", "mapreduce", "testMapReduce1", Constants.DEFAULT_NAMESPACE, "testAdapter1");
    } catch (java.lang.AssertionError e) {
        return ;
    }
    org.junit.Assert.fail();
}