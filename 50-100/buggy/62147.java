private boolean isDevicePlugin(final android.content.pm.ComponentInfo compInfo) {
    if (!(compInfo.exported)) {
        return false;
    }
    android.os.Bundle metaData = compInfo.metaData;
    if (metaData == null) {
        return false;
    }
    if ((metaData.get(org.deviceconnect.android.manager.plugin.DevicePluginManager.PLUGIN_META_DATA)) == null) {
        return false;
    }
    org.deviceconnect.android.localoauth.DevicePluginXml xml = org.deviceconnect.android.localoauth.DevicePluginXmlUtil.getXml(mContext, compInfo);
    return xml != null;
}