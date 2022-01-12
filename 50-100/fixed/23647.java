public static void setPrefData(android.content.Context context, java.lang.String key, java.lang.String value) {
    android.content.SharedPreferences prefs = context.getSharedPreferences(gemstone.gemster.Common.PREF_MAIN, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putString(key, java.lang.String.valueOf(value));
    editor.commit();
}