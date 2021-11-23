public <T> java.io.Serializable saveByContainsFields(java.lang.Class<T> entityClass, java.lang.Object entity, java.lang.String... containsFields) {
    java.lang.String[] fieldNames = com.cxytiandi.jdbc.util.BeanUtils.getContainsFieldNames(entityClass, "", containsFields);
    return doSave(entityClass, entity, fieldNames);
}