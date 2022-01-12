@java.lang.Override
protected void onResume() {
    super.onResume();
    profile = com.facebook.Profile.getCurrentProfile();
    nextActivity(profile);
}