public boolean persistStringSet(java.util.Set<java.lang.String> values) {
    if (shouldPersist()) {
        if (values.equals(getPersistedStringSet(null))) {
            return true;
        }
        android.content.SharedPreferences.Editor editor = getPreferenceManager().getSharedPreferences().edit();
        editor.putStringSet(getKey(), values);
        editor.apply();
        return true;
    }
    return false;
}