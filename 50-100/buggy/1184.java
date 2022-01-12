public void run() throws uk.ac.ebi.phenotype.solr.indexer.IndexerException {
    java.lang.Long start = java.lang.System.currentTimeMillis();
    try {
        uk.ac.ebi.phenotype.solr.indexer.StatisticalResultIndexer.logger.info("Populating statistical-results solr core");
        populateStatisticalResultsSolrCore();
    } catch (java.sql.SQLException | java.io.IOException | org.apache.solr.client.solrj.SolrServerException e) {
        throw new uk.ac.ebi.phenotype.solr.indexer.IndexerException(e);
    }
    uk.ac.ebi.phenotype.solr.indexer.StatisticalResultIndexer.logger.info("Populating statistical-results solr core - done [took: {}s]", (((java.lang.System.currentTimeMillis()) - start) / 1000.0));
}