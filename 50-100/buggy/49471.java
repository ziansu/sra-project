private void checkPreferences() {
    int sittingPeriod = (((prefs.getInt(SettingsActivity.KEY_PREF_SITTING_PERIOD, SettingsActivity.SITTING_DEFAULT_VALUE)) * 5) + 20) * (com.bitsorific.standup.activity.MainActivity.MINUTE);
    int standingPeriod = (java.lang.Integer.parseInt(prefs.getString(SettingsActivity.KEY_PREF_STANDING_PERIOD, SettingsActivity.STANDING_DEFAULT_VALUE))) * (com.bitsorific.standup.activity.MainActivity.MINUTE);
    if ((timePeriodSit) != sittingPeriod) {
        timePeriodSit = sittingPeriod;
        progressBar.setMax(timePeriodSit);
    }
    if ((timePeriodStand) != standingPeriod) {
        timePeriodStand = standingPeriod;
    }
}