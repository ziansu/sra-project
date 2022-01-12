private org.springframework.data.mongodb.core.Query getIdQueryFor(java.lang.Object object) {
    java.util.Map.Entry<java.lang.String, java.lang.Object> id = extractIdPropertyAndValue(object);
    return new org.springframework.data.mongodb.core.Query(where(id.getKey()).is(id.getValue()));
}