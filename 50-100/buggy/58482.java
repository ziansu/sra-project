public void setFloatPreference(java.lang.String prefName, java.lang.String key, float value) {
    if ((android.text.TextUtils.isEmpty(prefName)) || (android.text.TextUtils.isEmpty(key))) {
        return ;
    }
    android.content.SharedPreferences.Editor editor = getSharedPreferences(prefName, Context.MODE_PRIVATE).edit();
    editor.putFloat(key, value);
    editor.apply();
}