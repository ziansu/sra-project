public static boolean isFromSameCGgroup(java.util.List<com.emc.storageos.storagedriver.model.VolumeSnapshot> snapshots) {
    boolean isSameCG = false;
    if ((snapshots != null) && (!(snapshots.isEmpty()))) {
        java.lang.String groupId = snapshots.get(0).getConsistencyGroup();
        isSameCG = true;
        for (com.emc.storageos.storagedriver.model.VolumeSnapshot snapshot : snapshots) {
            if (!(snapshot.getConsistencyGroup().equals(groupId))) {
                isSameCG = false;
                break;
            }
        }
    }
    return isSameCG;
}