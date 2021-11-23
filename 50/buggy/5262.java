public com.stupid.method.app.AppManager setXmlBoolean(java.lang.Object key, boolean value) {
    getSharedPreferences().edit().putBoolean(com.stupid.method.app.AppManager.getKey(key), value).commit();
    return this;
}