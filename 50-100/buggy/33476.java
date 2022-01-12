@java.lang.Override
protected void onResume() {
    super.onResume();
    org.swain.asa.famous_pres_speeches.Controller.PlaybackController.createControllerView(this, org.swain.asa.famous_pres_speeches.View.ListActivity.activityName, org.swain.asa.famous_pres_speeches.View.ListActivity.class);
    android.util.Log.i(org.swain.asa.famous_pres_speeches.View.ListActivity.activityName, ("Setting screen name: " + (org.swain.asa.famous_pres_speeches.View.ListActivity.activityName)));
    mTracker.setScreenName(org.swain.asa.famous_pres_speeches.View.ListActivity.activityName);
    mTracker.send(new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder().build());
}