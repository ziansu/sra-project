private int getEvents(android.content.SharedPreferences prefs) {
    return prefs.getInt(Constants.PREF_KEY_RATING_EVENTS, 0);
}