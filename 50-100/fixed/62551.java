private void possiblyPurgeUniqueIndexCache(final java.lang.String type, final java.lang.String indexName, final java.util.Map<java.lang.String, java.lang.Object> original, final com.g414.st9.proto.service.schema.SchemaDefinition schemaDefinition, com.g414.st9.proto.service.schema.IndexDefinition indexDefinition) {
    if (indexDefinition.isUnique()) {
        com.g414.st9.proto.service.schema.SchemaValidatorTransformer transformer = new com.g414.st9.proto.service.schema.SchemaValidatorTransformer(schemaDefinition);
        java.lang.String uniqKey = tableHelper.computeIndexKey(type, indexName, indexDefinition, original, transformer);
        try {
            cache.delete(uniqKey);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}