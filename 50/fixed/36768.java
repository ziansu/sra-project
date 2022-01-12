public <T> java.io.Serializable saveByContainsFields(java.lang.Class<T> entityClass, java.lang.Object entity, java.lang.String... containsFields) {
    return doSave(entityClass, entity, containsFields);
}