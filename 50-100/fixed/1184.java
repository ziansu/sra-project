public void run() throws uk.ac.ebi.phenotype.solr.indexer.IndexerException {
    java.lang.Long start = java.lang.System.currentTimeMillis();
    uk.ac.ebi.phenotype.solr.indexer.StatisticalResultIndexer.logger.info("Populating statistical-results solr core");
    populateStatisticalResultsSolrCore();
    uk.ac.ebi.phenotype.solr.indexer.StatisticalResultIndexer.logger.info("Populating statistical-results solr core - done [took: {}s]", (((java.lang.System.currentTimeMillis()) - start) / 1000.0));
}