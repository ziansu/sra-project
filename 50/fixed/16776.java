public static java.lang.String getUserName(android.content.Context ctx) {
    android.util.Log.d("SaveSharedPreference", ("Getting username" + (edu.purdue.cs.hvzmasterapp.SaveSharedPreference.PREF_USER_NAME)));
    return edu.purdue.cs.hvzmasterapp.SaveSharedPreference.getSharedPreferences(ctx).getString(edu.purdue.cs.hvzmasterapp.SaveSharedPreference.PREF_USER_NAME, "");
}