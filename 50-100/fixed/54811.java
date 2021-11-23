@java.lang.Override
public void onResponse(java.lang.Boolean responseData) {
    if ((nearCache) != null) {
        if (cacheOnUpdate) {
            storeInNearCache(keyData, valueData, value);
        }else {
            invalidateNearCache(keyData);
        }
    }
    if (statisticsEnabled) {
        java.lang.Object response = clientContext.getSerializationService().toObject(responseData);
        handleStatisticsOnPutIfAbsent(start, ((java.lang.Boolean) (response)));
    }
}