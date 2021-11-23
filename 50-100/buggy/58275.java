public com.couchbase.lite.ReplicatorConfiguration copy() {
    return new com.couchbase.lite.ReplicatorConfiguration(database, target, replicatorType, continuous, conflictResolver, authenticator, java.util.Arrays.copyOf(pinnedServerCertificate, pinnedServerCertificate.length), new java.util.ArrayList<>(channels), new java.util.ArrayList<>(documentIDs));
}