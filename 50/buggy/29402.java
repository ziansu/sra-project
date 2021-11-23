private void validatePlatform() {
    if (com.emc.storageos.services.util.PlatformUtils.isVMwareVapp()) {
        com.emc.storageos.systemservices.impl.recovery.RecoveryManager.log.warn("Platform(vApp) is unsupported for node recovery");
        throw new java.lang.UnsupportedOperationException("Platform(vApp) is unsupported for node recovery");
    }
}