public static void putLong(java.lang.String key, java.lang.String value) {
    android.content.SharedPreferences sharedPreferences = cn.ieclipse.af.util.SharedPrefsUtils.getSharedPreferences();
    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
    edit.putString(key, value);
    edit.commit();
}