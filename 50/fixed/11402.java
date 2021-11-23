public void putString(java.lang.String key, java.lang.String value) {
    if (key == null)
        return ;
    
    if (value == null)
        return ;
    
    checkForNullValue(value);
    preferences.edit().putString(key, value).apply();
}