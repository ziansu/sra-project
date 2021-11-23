private void NotifyError(java.lang.String error) {
    theguywith3thumbs.kahanho.Notifier notifier = new theguywith3thumbs.kahanho.Notifier(activityContext);
    notifier.SendNotification("Location not found", "Enable location sharing from Android Settings");
    com.google.android.gms.analytics.Tracker mTracker = ((theguywith3thumbs.kahanho.AnalyticsApplication) (activityContext.getApplicationContext())).getDefaultTracker();
    mTracker.send(new com.google.android.gms.analytics.HitBuilders.EventBuilder().setCategory("MissedCall").setAction(error).build());
    theguywith3thumbs.kahanho.Logger.e(Constants.AppNameForLogging, "Location not found");
}