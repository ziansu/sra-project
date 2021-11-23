@java.lang.Override
public org.ovirt.mobile.movirt.model.Snapshot fire() {
    org.ovirt.mobile.movirt.model.Snapshot snapshot = restClient.getSnapshot(vmId, snapshotId).toEntity();
    if (snapshot != null) {
        snapshot.setVmId(vmId);
    }
    return snapshot;
}