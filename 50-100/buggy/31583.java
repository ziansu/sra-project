public boolean loadUser() {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String user_str = sp.getString("user", "");
    if (!(user_str.equalsIgnoreCase(""))) {
        this.user = gson.fromJson(user_str, com.dopamin.markod.objects.User.class);
        android.util.Log.v(com.dopamin.markod.activity.MainActivity.TAG, (("User (" + (com.dopamin.markod.activity.MainActivity.user.getFirstName())) + ") loaded from Shared."));
        return true;
    }
    return false;
}