public long searchTermSize(java.lang.String term) throws org.apache.solr.client.solrj.SolrServerException {
    java.lang.String queryTerm = ("\"" + term) + "\"";
    org.apache.solr.client.solrj.SolrQuery query = new org.apache.solr.client.solrj.SolrQuery();
    query.setQuery(term);
    query.setHighlight(false);
    org.apache.solr.client.solrj.response.QueryResponse rsp = tw.edu.ncu.im.Util.EmbeddedIndexSearcher.getService().query(query);
    org.apache.solr.common.SolrDocumentList docs = rsp.getResults();
    return docs.getNumFound();
}