protected java.lang.Boolean execute(java.lang.Object... args) {
    try {
        java.lang.String itemType = ((java.lang.String) (clazz.getField("ITEM_TYPE").get(null)));
        client.prepareDelete(getIndexNameForQuery(itemType), itemType, itemId).execute().actionGet();
        return true;
    } catch (java.lang.Exception e) {
        org.apache.unomi.persistence.elasticsearch.ElasticSearchPersistenceServiceImpl.logger.error("Cannot remove", e);
    }
    return false;
}