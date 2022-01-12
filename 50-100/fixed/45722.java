public java.lang.String space(java.lang.String schema) {
    assert schema != null;
    java.lang.String result = schema2space.get(schema);
    if (result == null) {
        result = schema2space.get(org.apache.ignite.internal.processors.query.h2.IgniteH2Indexing.escapeName(schema, true));
    }
    return result.isEmpty() ? null : result;
}