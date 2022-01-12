private static void saveFloatSetting(java.lang.String name, float state) {
    android.content.SharedPreferences sp = com.mx.demo.eye.APP.getApplication().getSharedPreferences(com.mx.demo.eye.SettingUtils.SETTING, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sp.edit();
    editor.putFloat(name, state);
    editor.commit();
}