public static void saveUserMetrics(android.content.Context context) {
    android.content.SharedPreferences sharedPref = context.getSharedPreferences("HearthTrackerSharedPreferences", Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString("ActiveDeckName", dumplingyzr.hearthtracker.Utils.sActiveDeckName);
    editor.putString("UserName", dumplingyzr.hearthtracker.Utils.sUserName);
    editor.putStringSet("UserDeckNames", dumplingyzr.hearthtracker.Utils.sUserDeckNames);
    editor.apply();
}