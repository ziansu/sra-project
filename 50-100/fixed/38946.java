public java.lang.String space(java.lang.String schema) {
    assert schema != null;
    if ("".equals(schema))
        return null;
    
    java.lang.String result = schema2space.get(schema);
    if (result != null)
        return result;
    
    result = schema2space.get(schema.toUpperCase());
    if (result != null)
        return result;
    
    return schema2space.get(org.apache.ignite.internal.processors.query.h2.IgniteH2Indexing.escapeName(schema, true));
}