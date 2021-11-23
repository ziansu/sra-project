public void putInt(java.lang.String key, int value) {
    if (key == null)
        return ;
    
    preferences.edit().putInt(key, value).apply();
}