@org.junit.Test
public void testImportmRnaData1BulkLoadOn() throws java.lang.Exception {
    org.mskcc.cbio.portal.scripts.MySQLbulkLoader.bulkLoadOn();
    runImportRnaData1();
}