@org.junit.Test
public void testStopWordProcessor() {
    try {
        java.lang.System.out.println("testing stop word processing");
        java.lang.String testString = "This is a test string";
        java.lang.String stoppedString = "test string";
        junit.framework.TestCase.assertTrue("stop word processing failed", ((stoppedString.compareTo(org.renci.databridge.contrib.ingest.util.IngestUtils.removeStopWords(testString))) == 0));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}