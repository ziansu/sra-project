private org.ohdsi.utilities.files.MultiRowIterator constructMultiRowIterator() {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.Iterator<org.ohdsi.utilities.files.Row>[] iterators = new java.util.Iterator[org.ohdsi.jCdmBuilder.etls.ars.ARSETL.TABLES.length];
    for (int i = 0; i < (org.ohdsi.jCdmBuilder.etls.ars.ARSETL.TABLES.length); i++)
        iterators[i] = new org.ohdsi.utilities.files.ReadCSVFileWithHeader(((((folder) + "/") + (org.ohdsi.jCdmBuilder.etls.ars.ARSETL.TABLES[i])) + ".csv"), true).iterator();
    
    return new org.ohdsi.utilities.files.MultiRowIterator("PERSON_ID", org.ohdsi.jCdmBuilder.etls.ars.ARSETL.TABLES, iterators);
}