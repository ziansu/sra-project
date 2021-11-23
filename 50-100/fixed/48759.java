private com.stratio.connector.inmemory.datastore.datatypes.SimpleValue[] convertToSimpleValueRow(com.stratio.connector.inmemory.datastore.InMemorySelector selector, java.lang.Object[] row) {
    com.stratio.connector.inmemory.datastore.datatypes.SimpleValue[] result = new com.stratio.connector.inmemory.datastore.datatypes.SimpleValue[row.length];
    int i = 0;
    for (java.lang.Object field : row) {
        result[(i++)] = new com.stratio.connector.inmemory.datastore.datatypes.SimpleValue(selector, field);
    }
    return result;
}