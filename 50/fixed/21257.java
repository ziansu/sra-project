private int processBatch() throws java.lang.Exception {
    return dk.statsbiblioteket.medieplatform.newspaper.metadataexporter.MetadataExporterStandalone.doMain(new java.lang.String[]{ "-c" , "target/metadataexporter/it.properties" , "-b" , dk.statsbiblioteket.medieplatform.newspaper.metadataexporter.MetadataExporterStandaloneIT.TEST_BATCH_ID , "-n" , "1" , "-p" , "false" });
}