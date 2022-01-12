private static void saveBooleanSetting(java.lang.String name, boolean state) {
    android.content.SharedPreferences sp = com.mx.demo.eye.APP.getApplication().getSharedPreferences(com.mx.demo.eye.SettingUtils.SETTING, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sp.edit();
    editor.putBoolean(name, state);
    editor.commit();
}