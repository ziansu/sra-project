public void checkShowHelpScreen() {
    android.content.SharedPreferences preferences = activity.getSharedPreferences(activity.getString(R.string.shared_prefs_file_key), Context.MODE_PRIVATE);
    alreadyShown = preferences.getBoolean(com.mutisya.numbersone.widget.HelpScreenManager.HELP_SHOWN, false);
    if (alreadyShown) {
        helpScreen.hideHelp();
    }else {
        android.util.Log.d(HelpScreen.TAG, "stopping clock");
        activity.getGameClock().stopClock();
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(com.mutisya.numbersone.widget.HelpScreenManager.HELP_SHOWN, true);
        editor.apply();
    }
}