public void putList(java.lang.String key, java.util.ArrayList<java.lang.String> strings) {
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    java.lang.String[] array = strings.toArray(new java.lang.String[strings.size()]);
    editor.putString(key, android.text.TextUtils.join("‚‗‚", array));
    editor.apply();
}