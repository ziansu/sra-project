public static void putLong(java.lang.String key, long value) {
    android.content.SharedPreferences sharedPreferences = cn.ieclipse.af.util.SharedPrefsUtils.getSharedPreferences();
    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
    edit.putLong(key, value);
    edit.commit();
}