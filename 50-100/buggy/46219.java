private void settingTrackersAndView() {
    setupTokenTracker();
    setupProfileTracker();
    mTokenTracker.startTracking();
    mProfileTracker.startTracking();
    com.facebook.Profile profile = com.facebook.Profile.getCurrentProfile();
    mTextDetails = ((android.widget.TextView) (findViewById(R.id.facebook_text)));
    mTextDetails.setText(constructWelcomeMessage(profile));
}