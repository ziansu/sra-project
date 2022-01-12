@java.lang.Override
public void removeDevicesFromCache(java.util.List<org.wso2.carbon.device.mgt.common.DeviceIdentifier> deviceList, int tenantId) {
    javax.cache.Cache<org.wso2.carbon.device.mgt.core.cache.DeviceCacheKey, org.wso2.carbon.device.mgt.common.Device> lCache = org.wso2.carbon.device.mgt.core.util.DeviceManagerUtil.getDeviceCache();
    for (org.wso2.carbon.device.mgt.common.DeviceIdentifier deviceIdentifier : deviceList) {
        org.wso2.carbon.device.mgt.core.cache.DeviceCacheKey cacheKey = getCacheKey(deviceIdentifier, tenantId);
        if (lCache.containsKey(cacheKey)) {
            lCache.remove(cacheKey);
        }
    }
}