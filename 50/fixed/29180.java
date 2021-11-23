public void putLong(java.lang.String key, long value) {
    if (key == null)
        return ;
    
    preferences.edit().putLong(key, value).apply();
}