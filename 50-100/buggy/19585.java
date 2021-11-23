private void setupReleaseVersion(java.lang.String version) {
    org.apache.cassandra.cql3.QueryProcessor.executeInternal(java.lang.String.format(("INSERT INTO system.local(key, release_version, cluster_name) " + "VALUES ('local', '%s', '%s')"), version, org.apache.cassandra.config.DatabaseDescriptor.getClusterName()));
    java.lang.String r = readLocalVersion();
    org.junit.Assert.assertEquals(java.lang.String.format("Expected %s, got %s", version, r), version, r);
}