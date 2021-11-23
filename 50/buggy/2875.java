public com.stupid.method.app.AppManager setXmlString(java.lang.Object key, java.lang.String value) {
    getSharedPreferences().edit().putString(com.stupid.method.app.AppManager.getKey(key), value).commit();
    return this;
}