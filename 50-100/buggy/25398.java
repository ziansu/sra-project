@org.androidannotations.annotations.Background
@java.lang.Override
public void onRefresh() {
    java.lang.String[] params = (isSnapshotFragment()) ? new java.lang.String[]{ getVmId() , filterSnapshotId } : new java.lang.String[]{ filterVmId };
    entityFacade.syncAll(new org.ovirt.mobile.movirt.ui.ProgressBarResponse<java.util.List<org.ovirt.mobile.movirt.model.Disk>>(this), params);
}