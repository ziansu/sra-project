protected void requestData(boolean refresh) {
    java.lang.String key = getCacheKey();
    if (isReadCacheData(refresh)) {
        readCacheData(key);
        apollo.tianya.util.TLog.log(TAG, ("requestData cache:" + key));
    }else {
        sendRequestData();
        apollo.tianya.util.TLog.log(TAG, ("requestData network:" + key));
    }
}