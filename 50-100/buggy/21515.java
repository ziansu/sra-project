public void onResume() {
    super.onResume();
    if ((isNotificationAccessGranted()) && (android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("isSpeakingNotificationEnabled", false))) {
        enableSpeakingNotification.setChecked(true);
        enableOnlyOnHeadset.setEnabled(false);
    }else {
        enableSpeakingNotification.setChecked(false);
        enableOnlyOnHeadset.setChecked(true);
    }
}