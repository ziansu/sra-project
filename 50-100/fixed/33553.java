@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((sharedPreferences.getBoolean(com.way.telecine.TelecineActivity.HIDE_FROM_RECENTS_KEY, true)) && (!(isChangingConfigurations()))) {
        android.util.Log.d("way", "Removing task because hide from recents preference was enabled.");
        finishAndRemoveTask();
    }
}