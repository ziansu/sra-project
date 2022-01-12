public org.piwik.sdk.Tracker trackEvent(java.lang.String category, java.lang.String action, java.lang.String label, java.lang.Integer value) {
    return track(new org.piwik.sdk.TrackMe().set(QueryParams.EVENT_CATEGORY, category).set(QueryParams.EVENT_ACTION, action).set(QueryParams.EVENT_NAME, label).set(QueryParams.EVENT_VALUE, value));
}