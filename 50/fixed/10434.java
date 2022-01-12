protected com.emc.storageos.db.client.model.BlockSnapshot prepareSnapshotFromVolume(com.emc.storageos.db.client.model.Volume volume, java.lang.String label) {
    return prepareSnapshotFromVolume(volume, label, label, false);
}