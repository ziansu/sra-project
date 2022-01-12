private java.lang.Long fetchSearchKeyId(java.lang.String suggestedField) {
    javax.persistence.Query query = mgr.createQuery("select f from MetadataEntity f where f.value = :value");
    query.setParameter("value", suggestedField);
    java.util.List<org.esbtools.message.admin.common.orm.MetadataEntity> queryResult = ((java.util.List<org.esbtools.message.admin.common.orm.MetadataEntity>) (query.getResultList()));
    if ((queryResult != null) && (!(queryResult.isEmpty()))) {
        return queryResult.get(0).getId();
    }
    return null;
}