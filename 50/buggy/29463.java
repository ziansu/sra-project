public org.gbif.checklistbank.cli.importer.Importer build(org.gbif.checklistbank.cli.importer.ImporterConfiguration cfg, java.util.UUID datasetKey, int poolSize) throws java.sql.SQLException {
    initGuice(cfg, poolSize);
    return org.gbif.checklistbank.cli.importer.Importer.create(cfg, datasetKey, nameUsageService, usageService, sqlService, solrService);
}