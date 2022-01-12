public static boolean isLocalSnapshotSupported(com.emc.storageos.model.vpool.BlockVirtualPoolRestRep virtualPool) {
    if (virtualPool == null) {
        return false;
    }
    return (((virtualPool.getProtection()) != null) && ((virtualPool.getProtection().getSnapshots()) != null)) && ((virtualPool.getProtection().getSnapshots().getMaxSnapshots()) > 0);
}