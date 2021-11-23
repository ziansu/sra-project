@java.lang.Override
protected org.codice.ddf.migration.MigrationException newError(java.lang.String reason, java.lang.Throwable cause) {
    return new org.codice.ddf.migration.MigrationException(Messages.EXPORT_JAVA_PROPERTY_ERROR, getProperty(), propertiesPath, getPath(), reason, cause);
}