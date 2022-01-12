public void onResume() {
    super.onResume();
    if ((isNotificationAccessGranted()) && (android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("isSpeakingNotificationEnabled", false))) {
        enableSpeakingNotification.setChecked(true);
        enableOnlyOnHeadset.setEnabled(true);
    }else {
        enableSpeakingNotification.setChecked(false);
    }
}