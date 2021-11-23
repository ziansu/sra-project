private void sync() {
    com.hiperfabric.replication.entities.EntityVersion[] v = entityStore.getEntityVersions();
    int n = v.length;
    for (int i = 0; i < n; i++) {
        com.hiperfabric.replication.entities.EntityVersion e = v[i];
        syncEntity(e.name(), e.version());
    }
}