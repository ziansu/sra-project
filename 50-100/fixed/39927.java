@org.testng.annotations.Test(enabled = true)
public void testElivagarRetrievingModifiedBooks() throws java.lang.Exception {
    int count = 10;
    java.util.Date oneYearAgo = new java.util.Date(((java.lang.System.currentTimeMillis()) - (MILLIS_PER_YEAR)));
    elivagarWorkflow.retrieveModifiedBooks(oneYearAgo, count);
    org.testng.Assert.assertEquals(baseDir.list().length, count);
}