private void trackInteraction(java.lang.String key, java.lang.String value, java.lang.String event) {
    if (!(BuildConfig.DEBUG)) {
        com.google.firebase.analytics.FirebaseAnalytics analytics = com.google.firebase.analytics.FirebaseAnalytics.getInstance(this);
        android.os.Bundle track = new android.os.Bundle();
        track.putString(key, value);
        analytics.logEvent(event, track);
    }
}