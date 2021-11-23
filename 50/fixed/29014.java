private com.google.firebase.analytics.FirebaseAnalytics getAnalytics() {
    if ((analytics) == null) {
        analytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(context);
    }
    return analytics;
}