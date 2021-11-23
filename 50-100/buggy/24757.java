public static boolean isLocalSnapshotSupported(com.emc.storageos.model.vpool.BlockVirtualPoolRestRep virtualPool) {
    return (((virtualPool.getProtection()) != null) && ((virtualPool.getProtection().getSnapshots()) != null)) && ((virtualPool.getProtection().getSnapshots().getMaxSnapshots()) > 0);
}