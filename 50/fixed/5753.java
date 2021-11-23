private void saveKeyValuePair(java.lang.String key, java.lang.String value) {
    if (value == null) {
        com.socrata.datasync.config.userpreferences.UserPreferencesJava.userPrefs.remove(key);
    }else {
        com.socrata.datasync.config.userpreferences.UserPreferencesJava.userPrefs.put(key, value.trim());
    }
}