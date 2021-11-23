public void putFloat(java.lang.String key, float value) {
    if (key == null)
        return ;
    
    preferences.edit().putFloat(key, value).apply();
}