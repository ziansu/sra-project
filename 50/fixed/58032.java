private void addDate(org.apache.solr.common.SolrInputDocument doc, java.lang.String value, boolean mv) {
    addField(doc, "dt", value, mv);
}