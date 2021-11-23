private com.kylinolap.metadata.model.TableDesc reloadSourceTableAt(java.lang.String path) throws java.io.IOException {
    com.kylinolap.common.persistence.ResourceStore store = getStore();
    com.kylinolap.metadata.model.TableDesc t = store.getResource(path, com.kylinolap.metadata.model.TableDesc.class, com.kylinolap.metadata.MetadataManager.TABLE_SERIALIZER);
    t.init();
    java.lang.String tableIdentity = t.getIdentity();
    srcTableMap.putLocal(tableIdentity, t);
    return t;
}