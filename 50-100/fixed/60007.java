@java.lang.Override
public java.util.List<org.recap.model.solr.BibItem> search(org.recap.model.search.SearchRecordsRequest searchRecordsRequest) {
    java.util.List<org.recap.model.solr.BibItem> bibItems = new java.util.ArrayList<>();
    try {
        if (isItemField(searchRecordsRequest)) {
        }else {
            bibItems = searchByBib(searchRecordsRequest);
        }
    } catch (org.apache.solr.client.solrj.SolrServerException e) {
        log.error(e.getMessage());
    } catch (java.io.IOException e) {
        log.error(e.getMessage());
    }
    return bibItems;
}