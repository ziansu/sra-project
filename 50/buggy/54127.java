public final <T> retrofit2.Call<T> getServiceCallIfExist(java.lang.String key) {
    if (!(mServiceCallsMap.containsKey(key)))
        return mServiceCallsMap.get(key);
    else
        return null;
    
}