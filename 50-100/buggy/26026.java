public void retrieveLeaderboardList(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = sharedPreferences.getString("list", null);
    java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.ArrayList<io.techies.com.puzzle_8.Player>>() {    }.getType();
    io.techies.com.puzzle_8.PuzzleBoardView.listOfPlayers = gson.fromJson(json, type);
}