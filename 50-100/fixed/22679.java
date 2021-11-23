private org.flywaydb.core.internal.resolver.ResolvedMigrationImpl extractMigrationInfo(org.flywaydb.core.internal.util.scanner.Resource resource) {
    org.flywaydb.core.internal.resolver.ResolvedMigrationImpl migration = new org.flywaydb.core.internal.resolver.ResolvedMigrationImpl();
    org.flywaydb.core.internal.util.Pair<org.flywaydb.core.api.MigrationVersion, java.lang.String> info = org.flywaydb.core.internal.resolver.MigrationInfoHelper.extractVersionAndDescription(resource.getFilename(), sqlMigrationPrefix, sqlMigrationSeparator, sqlMigrationSuffix);
    migration.setVersion(info.getLeft());
    migration.setDescription(info.getRight());
    migration.setScript(extractScriptName(resource));
    migration.setChecksum(calculateChecksum(resource.loadAsBytes()));
    migration.setType(MigrationType.SQL);
    return migration;
}