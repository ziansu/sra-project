public int getDeleteSleepDisplay() {
    int deleteSleepDisplay = preferences.getDeleteSleepDisplay();
    if (deleteSleepDisplay < 0) {
        deleteSleepDisplay = com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.DEFAULT_DELETE_SLEEP_DELAIS;
        preferences.setDeleteSleepDisplay(deleteSleepDisplay);
    }
    return deleteSleepDisplay;
}