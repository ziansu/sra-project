public static com.google.appengine.api.datastore.Key getSubCategoryKey(java.lang.String category, java.lang.String subCategory) throws com.mame.wisdom.exception.WisdomDatastoreException {
    com.mame.wisdom.util.DbgUtil.showLog(com.mame.wisdom.datastore.DatastoreKeyGenerator.TAG, "getSubCategoryKey");
    if ((category == null) || (subCategory == null)) {
        com.mame.wisdom.util.DbgUtil.showLog(com.mame.wisdom.datastore.DatastoreKeyGenerator.TAG, "category or subCategory identifier is null");
        throw new com.mame.wisdom.exception.WisdomDatastoreException("category or subCategory identifier is null");
    }
    java.lang.String identifier = (category + "-") + subCategory;
    com.google.appengine.api.datastore.Key key = com.google.appengine.api.datastore.KeyFactory.createKey(DBConstant.KIND_SUB_CATEGORY, identifier);
    return key;
}