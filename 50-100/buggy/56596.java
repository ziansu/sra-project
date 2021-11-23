public static boolean isFromSameCGgroup(java.util.List<com.emc.storageos.storagedriver.model.VolumeSnapshot> snapshots) {
    boolean isSameCG = false;
    if ((snapshots != null) && ((snapshots.size()) > 0)) {
        java.lang.String groupId = snapshots.get(0).getConsistencyGroup();
        isSameCG = true;
        for (com.emc.storageos.storagedriver.model.VolumeSnapshot snapshot : snapshots) {
            if ((snapshot.getConsistencyGroup()) != groupId) {
                isSameCG = false;
                break;
            }
        }
    }
    return isSameCG;
}