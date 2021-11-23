@org.junit.Test
public void testImportmRnaData1BulkLoadOn() throws java.lang.Exception {
    if (!(org.mskcc.cbio.portal.scripts.MySQLbulkLoader.isBulkLoad()))
        org.mskcc.cbio.portal.scripts.MySQLbulkLoader.bulkLoadOn();
    
    runImportRnaData1();
}