static void savePreferences(android.app.Activity activity) {
    android.content.SharedPreferences preferences = activity.getPreferences(Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = preferences.edit();
    editor.putString("Channel", com.anigeek.morse.MorseOptions.getChannel());
    editor.putInt("History", com.anigeek.morse.MorseOptions.getShowHistory());
    editor.apply();
}