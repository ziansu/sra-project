@java.lang.Override
public void removeDevicesFromCache(java.util.List<org.wso2.carbon.device.mgt.core.cache.DeviceCacheKey> deviceList) {
    javax.cache.Cache<org.wso2.carbon.device.mgt.core.cache.DeviceCacheKey, org.wso2.carbon.device.mgt.common.Device> lCache = org.wso2.carbon.device.mgt.core.util.DeviceManagerUtil.getDeviceCache();
    for (org.wso2.carbon.device.mgt.core.cache.DeviceCacheKey cacheKey : deviceList) {
        if (lCache.containsKey(cacheKey)) {
            lCache.remove(cacheKey);
        }
    }
}