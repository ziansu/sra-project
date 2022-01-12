public static void sendView(android.content.Context context, java.lang.String appScreen) {
    if (!(com.daskiworks.ghwatch.backend.GHConstants.DEBUG)) {
        com.google.android.gms.analytics.Tracker t = com.daskiworks.ghwatch.ActivityTracker.getTracker(context);
        if (t != null) {
            t.setScreenName(appScreen);
            t.send(new com.google.android.gms.analytics.HitBuilders.AppViewBuilder().build());
        }
    }
}