private ManagedObjectReference findSnapshotInTree(java.util.List<VirtualMachineSnapshotTree> vmSnapshotList, java.lang.String snapshotName) {
    ManagedObjectReference snapshotMor = null;
    for (VirtualMachineSnapshotTree vmSnapshot : vmSnapshotList) {
        if (vmSnapshot.getName().equalsIgnoreCase(snapshotName)) {
            java.lang.System.out.println(java.lang.String.format("Found snapshot [ %s ] for virtual machine.", snapshotName));
            return vmSnapshot.getSnapshot();
        }else {
            java.util.List<VirtualMachineSnapshotTree> childTree = vmSnapshot.getChildSnapshotList();
            snapshotMor = findSnapshotInTree(childTree, snapshotName);
            if (snapshotMor != null) {
                break;
            }
        }
    }
    return snapshotMor;
}