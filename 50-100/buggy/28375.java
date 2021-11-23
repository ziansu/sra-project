public static void setUserName(android.content.Context ctx, java.lang.String userName) {
    android.util.Log.d("SaveSharedPreference", "Setting username");
    android.content.SharedPreferences.Editor editor = edu.purdue.cs.hvzmasterapp.SaveSharedPreference.getSharedPreferences(ctx).edit();
    editor.putString(edu.purdue.cs.hvzmasterapp.SaveSharedPreference.PREF_USER_NAME, userName);
    editor.commit();
}