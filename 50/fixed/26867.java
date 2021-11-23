public com.stupid.method.app.AppManager setXmlInt(java.lang.Object key, int value) {
    getSharedPreferences().putInt(com.stupid.method.app.AppManager.getKey(key), value);
    return this;
}