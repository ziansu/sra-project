private void setStartOfRatingPeriod(android.content.SharedPreferences prefs, long startOfRatingPeriod) {
    prefs.edit().putLong(Constants.PREF_KEY_START_OF_RATING_PERIOD, startOfRatingPeriod).commit();
}