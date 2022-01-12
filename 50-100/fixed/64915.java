public void testAddRemoveImporterProcedure() throws java.lang.Exception {
    java.lang.System.out.println("Removing and adding procedures that the importers rely on should result in a restart");
    org.voltdb.TestImportSuite.ImporterConnector testConnector = new org.voltdb.TestImportSuite.ImporterConnector("localhost", 7001, '\t');
    testConnector.tryPush(5);
    applySchemaChange("DROP TABLE importTable;");
    try {
        testConnector.tryPush(5);
        fail("Importer is still running even though its procedure is disabled");
    } catch (java.io.IOException expected) {
    }
    applySchemaChange("CREATE TABLE IMPORTTABLE (PKEY bigint NOT NULL, A_INTEGER_VALUE bigint); PARTITION TABLE IMPORTTABLE ON COLUMN PKEY;");
    testConnector.tryPush(5);
}