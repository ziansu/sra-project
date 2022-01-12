public void put(java.lang.String column, java.lang.Object value) {
    if (value == null) {
        currentState.put(column, new org.hibernate.ogm.datastore.spi.TupleOperation(column, null, PUT_NULL));
    }
    currentState.put(column, new org.hibernate.ogm.datastore.spi.TupleOperation(column, value, PUT));
}