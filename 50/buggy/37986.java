public java.lang.String getMigrationStrategy() {
    if (org.apache.commons.lang.StringUtils.isBlank(migrationStrategy)) {
        return com.tacitknowledge.util.migration.MigrationRunnerFactory.DEFAULT_MIGRATION_STRATEGY;
    }
    return migrationStrategy;
}