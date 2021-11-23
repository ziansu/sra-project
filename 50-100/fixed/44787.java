public static void persistChallengeToken(java.lang.String token, java.lang.String deviceID, java.lang.String username) {
    java.lang.Object objCacheEntry = org.wso2.carbon.mdm.mobileservices.windows.common.util.DeviceUtil.getCacheEntry(token);
    org.wso2.carbon.mdm.mobileservices.windows.common.beans.CacheEntry cacheEntry;
    if (objCacheEntry == null) {
        cacheEntry = new org.wso2.carbon.mdm.mobileservices.windows.common.beans.CacheEntry();
        cacheEntry.setUsername(username);
    }else {
        cacheEntry = ((org.wso2.carbon.mdm.mobileservices.windows.common.beans.CacheEntry) (objCacheEntry));
    }
    if (deviceID != null) {
        cacheEntry.setDeviceID(deviceID);
    }
    org.wso2.carbon.mdm.mobileservices.windows.common.util.DeviceUtil.getTokenCache().put(token.trim(), cacheEntry);
}