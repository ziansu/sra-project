public void begin() {
    android.content.SharedPreferences preferences = activityContext.getPreferences(Context.MODE_PRIVATE);
    currentlyRunningId = preferences.getInt(activityContext.getResources().getString(R.string.shared_preferences_current_id_key), (-1));
    timeAtBeginning = preferences.getLong(activityContext.getResources().getString(R.string.shared_preferences_begin_time_key), (-1));
    timeAtLastUpdate = -1;
    myHandler.post(this);
}