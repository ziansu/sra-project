public net.mostlyoriginal.api.io.network.common.SnapshotEncoder appendEntities(com.artemis.utils.IntBag entities) {
    final int[] data = entities.getData();
    for (int i = 0, s = entities.size(); s > i; i++) {
        appendEntity(data[i]);
    }
    return this;
}