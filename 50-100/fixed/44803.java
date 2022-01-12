@org.junit.Test
public void cropdataIngestionFlowTest() throws java.lang.Exception {
    java.util.List<java.io.File> list = gatherTestInputCSVFile("all\\cropdata");
    org.junit.Assert.assertNotNull(list);
    org.junit.Assert.assertFalse(list.isEmpty());
    runFlow(list, true);
    org.junit.Assert.assertEquals(1504, cropDataDAO.findAll().size());
}