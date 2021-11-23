@java.lang.Override
public org.ovirt.mobile.movirt.model.Snapshot fire() {
    org.ovirt.mobile.movirt.model.Snapshot snapshot = restClient.getSnapshot(vmId, snapshotId).toEntity();
    setVmId(snapshot, vmId);
    return snapshot;
}