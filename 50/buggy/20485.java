@org.junit.Test
public void testParseFile() throws java.lang.Exception {
    log.info("testParseFile");
    ekb.elastic.ingest.Loader loader = new ekb.elastic.ingest.Loader("src/test/resources/test_trip_data.csv", 100);
}