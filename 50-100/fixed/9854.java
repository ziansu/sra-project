private void firstRun(int currentVersion) {
    android.content.Intent activity = new android.content.Intent(this, es.ugr.swad.swadroid.sync.AccountAuthenticator.class);
    es.ugr.swad.swadroid.preferences.Preferences.setSyncTime(java.lang.String.valueOf(Constants.DEFAULT_SYNC_TIME));
    startActivity(activity);
    es.ugr.swad.swadroid.preferences.Preferences.setLastVersion(currentVersion);
    firstRun = true;
    es.ugr.swad.swadroid.preferences.Preferences.initializeSelectedCourse();
}