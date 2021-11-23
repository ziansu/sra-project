private static void saveIntSetting(java.lang.String name, int state) {
    android.content.SharedPreferences sp = com.mx.demo.eye.APP.getApplication().getSharedPreferences(com.mx.demo.eye.SettingUtils.SETTING, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sp.edit();
    editor.putInt(name, state);
    editor.apply();
}