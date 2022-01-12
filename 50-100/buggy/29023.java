private void addObject(edu.unc.lib.dl.data.ingest.solr.SolrUpdateRequest updateRequest) throws java.lang.Exception {
    org.jdom.Document resultDoc = getObjectViewXML(updateRequest);
    if ((resultDoc != null) && ((resultDoc.getRootElement().getChild("digitalObject", edu.unc.lib.dl.data.ingest.solr.SolrUpdateRunnable.foxmlNS)) != null)) {
        edu.unc.lib.dl.data.ingest.solr.SolrUpdateRunnable.solrUpdateService.getUpdateDocTransformer().addDocument(resultDoc);
    }
}