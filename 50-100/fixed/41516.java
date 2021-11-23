private void setSettingStringSet(android.content.Context context, int preferenceKeyStringId, java.util.Set<java.lang.String> value) {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putStringSet(context.getString(preferenceKeyStringId), new java.util.HashSet<>(value));
    editor.commit();
}