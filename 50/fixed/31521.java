private void sync() throws java.lang.Exception {
    org.gbif.checklistbank.cli.importer.ImporterIT iit = new org.gbif.checklistbank.cli.importer.ImporterIT();
    org.gbif.checklistbank.cli.importer.Importer importer = iit.build(iCfg, datasetKey);
    importer.run();
    iit.close();
}