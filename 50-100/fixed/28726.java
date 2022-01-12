private boolean vdcPropertiesChanged() {
    long localVdcConfigVersion = ((localVdcPropInfo.getProperty(VdcConfigUtil.VDC_CONFIG_VERSION)) == null) ? 0 : java.lang.Long.parseLong(localVdcPropInfo.getProperty(VdcConfigUtil.VDC_CONFIG_VERSION));
    long targetVdcConfigVersion = targetSiteInfo.getVdcConfigVersion();
    com.emc.storageos.systemservices.impl.vdc.VdcManager.log.info("local vdc config version: {}, target vdc config version: {}", localVdcConfigVersion, targetVdcConfigVersion);
    return localVdcConfigVersion != targetVdcConfigVersion;
}