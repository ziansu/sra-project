protected java.util.Set<java.lang.String> getPersistedStringSet(java.util.Set<java.lang.String> defaultReturnValue) {
    if (!(shouldPersist())) {
        return defaultReturnValue;
    }
    return getPreferenceManager().getSharedPreferences().getStringSet(getKey(), defaultReturnValue);
}