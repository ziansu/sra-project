@java.lang.Override
public com.impetus.kundera.client.EnhanceEntity findById(java.lang.String primaryKey, com.impetus.kundera.metadata.model.EntityMetadata m, java.util.List<java.lang.String> relationNames, com.impetus.kundera.client.Client client) {
    try {
        java.lang.Object o = client.find(m.getEntityClazz(), primaryKey, relationNames);
        return new com.impetus.kundera.client.EnhanceEntity(o, getId(o, m), null);
    } catch (java.lang.Exception e) {
        throw new javax.persistence.PersistenceException(("Error while reading findById for Hbase" + (e.getMessage())));
    }
}