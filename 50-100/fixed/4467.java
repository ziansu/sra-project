private void addFieldID(int tenantId, java.lang.String path, java.lang.String rawContent, org.apache.solr.common.SolrInputDocument solrInputDocument) {
    java.lang.String id = generateId(tenantId, path);
    if (id == null) {
        id = (IndexingConstants.FIELD_ID) + (rawContent.hashCode());
    }
    solrInputDocument.addField(IndexingConstants.FIELD_ID, id, 1.0F);
}