public void onClick(android.content.DialogInterface arg0, int arg1) {
    android.content.SharedPreferences settings = getSharedPreferences(Login.PREFS_NAME, 0);
    user = settings.getString("user", null);
    new com.example.ankit.interiit.MainActivity.LongOperation1().execute(((((((user.toString()) + "_") + (lattitude.toString())) + "_") + (longitude.toString())) + "_1"));
}