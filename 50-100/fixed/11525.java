public android.content.SharedPreferences storeScores(java.util.List scores) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    android.content.SharedPreferences.Editor editor = prefs.edit();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String scoreJson = gson.toJson(scores);
    editor.putString(com.evader.rookies.evade.StoreScores.SCORES_STRING, scoreJson);
    editor.apply();
    return prefs;
}