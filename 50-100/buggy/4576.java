private static java.util.List<com.emc.storageos.model.vpool.VirtualPoolRemoteReplicationSettingsParam> getRemoteReplicationSettings(com.emc.storageos.model.vpool.BlockVirtualPoolProtectionParam protection) {
    if (protection != null) {
        com.emc.storageos.model.vpool.VirtualPoolRemoteReplicationParam param = protection.getRemoteReplicationParam();
        return param != null ? param.getRemoteReplicationSettings() : java.util.Collections.emptyList();
    }
    return java.util.Collections.emptyList();
}