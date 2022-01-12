private void addToSharedPreferences(java.lang.String event) {
    mEditor.putString(Constants.PREFERENCES_EVENT, event).apply();
}