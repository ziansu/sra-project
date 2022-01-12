java.lang.String[] getKeyNames() {
    assert dir.hasReadLock();
    if (!(hasCreatedEncryptionZone())) {
        return new java.lang.String[0];
    }
    java.lang.String[] ret = new java.lang.String[encryptionZones.size()];
    int index = 0;
    for (java.util.Map.Entry<java.lang.Long, org.apache.hadoop.hdfs.server.namenode.EncryptionZoneManager.EncryptionZoneInt> entry : encryptionZones.entrySet()) {
        ret[(index++)] = entry.getValue().getKeyName();
    }
    return ret;
}