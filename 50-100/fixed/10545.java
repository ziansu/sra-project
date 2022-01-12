public com.emc.hpux.model.HpuxVersion getHpuxMinimumVersion(boolean forceLookup) {
    if (forceLookup || ((hpuxVersion) == null)) {
        java.lang.String versionProp = this.getSysProperty(com.emc.storageos.computesystemcontroller.impl.ComputeSystemDiscoveryVersionValidator.HPUX_MIN_PROP);
        if (isValidVersionNumber(versionProp)) {
            hpuxVersion = new com.emc.hpux.model.HpuxVersion(versionProp);
        }else {
            hpuxVersion = null;
            throw new java.lang.IllegalStateException(java.lang.String.format("System property for HPUX Version Number(%s) is invalid - value is '%s'", com.emc.storageos.computesystemcontroller.impl.ComputeSystemDiscoveryVersionValidator.HPUX_MIN_PROP, versionProp));
        }
    }
    return hpuxVersion;
}