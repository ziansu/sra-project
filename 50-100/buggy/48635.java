private static boolean store(final android.content.Context context, final java.lang.String key, final java.lang.String value) {
    final android.content.SharedPreferences.Editor editor = context.getSharedPreferences("settings", Context.MODE_PRIVATE).edit();
    editor.putString(key, android.util.Base64.encodeToString(value.getBytes(), Base64.NO_WRAP));
    return editor.commit();
}