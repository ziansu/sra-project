private static java.util.List<com.emc.storageos.model.vpool.VirtualPoolRemoteReplicationSettingsParam> getRemoteReplicationSettings(com.emc.storageos.model.vpool.BlockVirtualPoolProtectionParam protection) {
    if (((protection != null) && ((protection.getRemoteReplicationParam()) != null)) && ((protection.getRemoteReplicationParam().getRemoteReplicationSettings()) != null)) {
        return protection.getRemoteReplicationParam().getRemoteReplicationSettings();
    }
    return java.util.Collections.emptyList();
}