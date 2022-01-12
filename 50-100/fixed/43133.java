@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    showResume = sharedPreferences.getBoolean("can_resume", false);
    if (showResume) {
        mainResumeButton.setAlpha(1.0F);
        mainResumeButton.setOnClickListener(this);
    }else {
        mainResumeButton.setAlpha(0.5F);
        mainResumeButton.setOnClickListener(null);
    }
    mainPlayButton.setAlpha(1.0F);
    mainRankButton.setAlpha(1.0F);
    mainClockButton.setAlpha(1.0F);
}