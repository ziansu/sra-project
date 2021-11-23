private java.lang.String getDbTableName(java.lang.String schemaName) {
    com.google.common.base.Preconditions.checkArgument(schemaName.matches(".+_.+_.+"));
    return schemaName.replaceFirst("_", ".").substring(0, schemaName.lastIndexOf('_'));
}