public int[] batchSaveByContainsFields(java.lang.Class<?> entityClass, java.util.List<?> entitys, java.lang.String... containsFields) {
    org.springframework.util.Assert.notNull(entitys);
    java.util.List<java.lang.Object[]> allValues = new java.util.ArrayList<java.lang.Object[]>();
    return doBatchSave(entityClass, entitys, allValues, containsFields);
}