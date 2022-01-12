public org.sangguo.draggertest.http.core.ApiInterface getApi(java.lang.Class<? extends org.sangguo.draggertest.http.core.ApiInterface> apiClass) {
    if ((cacheMap.get(apiClass)) != null) {
        return cacheMap.get(apiClass);
    }
    android.util.Log.i("http", ("apiClass:" + (apiClass.getName())));
    org.sangguo.draggertest.http.core.ApiInterface apiInterface = reflect(apiClass);
    if ((apiInterface != null) && (apiInterface.cache())) {
        cacheMap.put(apiClass.getName(), apiInterface);
    }
    return apiInterface;
}