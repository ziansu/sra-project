public void onClick(android.content.DialogInterface arg0, int arg1) {
    android.content.SharedPreferences settings = getSharedPreferences(Login.PREFS_NAME, 0);
    user = settings.getString("user", null);
    java.lang.System.out.println();
    new com.example.ankit.interiit.MainActivity.LongOperation1().execute(((((((user) + "_") + (lattitude)) + "_") + (longitude)) + "_1"));
}