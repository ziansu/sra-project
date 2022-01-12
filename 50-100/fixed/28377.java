@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    int length = getMinutes(lengthBar.getProgress());
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putString(Constants.PREFERENCES_KEY_SLEEP_TIMER_DURATION, java.lang.Integer.toString(length));
    editor.commit();
    getDownloadService().setSleepTimerDuration(length);
    getDownloadService().startSleepTimer();
    context.supportInvalidateOptionsMenu();
}