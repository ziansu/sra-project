protected java.lang.Boolean execute(java.lang.Object... args) throws java.lang.Exception {
    try {
        java.lang.String itemType = ((java.lang.String) (clazz.getField("ITEM_TYPE").get(null)));
        client.prepareDelete(getIndexNameForQuery(itemType), itemType, itemId).execute().actionGet();
        return true;
    } catch (java.lang.Exception e) {
        throw new java.lang.Exception("Cannot remove", e);
    }
}