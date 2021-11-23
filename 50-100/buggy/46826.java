public static java.lang.String getSystemType(com.emc.storageos.db.client.model.VirtualPool virtualPool) {
    java.lang.String systemType = null;
    if (((virtualPool != null) && ((virtualPool.getArrayInfo()) != null)) && (virtualPool.getArrayInfo().containsKey(com.emc.storageos.db.client.upgrade.callbacks.QualityOfServiceMigration.SYSTEM_TYPE))) {
        for (java.lang.String sysType : virtualPool.getArrayInfo().get(com.emc.storageos.db.client.upgrade.callbacks.QualityOfServiceMigration.SYSTEM_TYPE)) {
            systemType = sysType;
            break;
        }
    }
    return systemType;
}