@org.junit.Test
public void testSearchAcrossIndices() {
    java.util.Set<java.util.UUID> entitySetIds = com.google.common.collect.Sets.newHashSet(chicagoEmployeesEntitySetId, entitySet2Id);
    java.util.Map<java.util.UUID, java.lang.String> fieldSearches = com.google.common.collect.Maps.newHashMap();
    fieldSearches.put(employeeIdPropertyId, "12347");
    elasticsearchApi.executeEntitySetDataSearchAcrossIndices(entitySetIds, fieldSearches, 50, true);
}