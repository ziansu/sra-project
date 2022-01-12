public static void setEmail(android.content.Context context, java.lang.String email) {
    android.content.SharedPreferences sharedPref = context.getSharedPreferences(context.getString(R.string.preference_file_key), Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    if (email == null)
        editor.remove(onl.deepspace.wgs.Helper.EMAIL);
    else
        editor.putString(onl.deepspace.wgs.Helper.EMAIL, email);
    
    editor.apply();
}