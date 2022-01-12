public net.mostlyoriginal.api.io.network.common.SnapshotEncoder appendEntities(com.artemis.utils.IntBag entities) {
    final int[] data = entities.getData();
    for (int i = 0, s = entities.size(); s > i; i++) {
        final net.mostlyoriginal.api.io.network.common.NetworkMetadata metadata = mNetworkMetadata.getSafe(data[i]);
        if (metadata != null) {
            appendEntity(metadata.id);
        }else
            throw new net.mostlyoriginal.api.io.network.common.SnapshotException("Attempt to snapshot non networked entity. NetworkMetadata component required.");
        
    }
    return this;
}