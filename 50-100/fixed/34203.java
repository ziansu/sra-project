private void testMigrateDataDirs(java.lang.String version, int numLegacyFiles) throws java.io.IOException {
    java.nio.file.Path migrationSSTableRoot = java.nio.file.Paths.get(java.lang.System.getProperty(org.apache.cassandra.db.SystemKeyspaceTest.MIGRATION_SSTABLES_ROOT), version);
    java.nio.file.Path dataDir = java.nio.file.Paths.get(org.apache.cassandra.config.DatabaseDescriptor.getAllDataFileLocations()[0]);
    org.apache.commons.io.FileUtils.copyDirectory(migrationSSTableRoot.toFile(), dataDir.toFile());
    assertEquals(numLegacyFiles, org.apache.cassandra.db.SystemKeyspaceTest.numLegacyFiles());
    org.apache.cassandra.db.SystemKeyspace.migrateDataDirs();
    assertEquals(0, org.apache.cassandra.db.SystemKeyspaceTest.numLegacyFiles());
}