@java.lang.Override
protected void onResume() {
    super.onResume();
    com.facebook.Profile profile = com.facebook.Profile.getCurrentProfile();
    nextActivity(profile, "", "");
}