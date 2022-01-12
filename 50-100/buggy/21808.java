private void reviewAmplitudeEvent(java.lang.String reviewId, java.lang.String action) {
    java.util.HashMap<java.lang.String, java.lang.String> properties = new java.util.HashMap<java.lang.String, java.lang.String>();
    properties.put(StaticConstants.ACTION, action);
    properties.put(StaticConstants.REVIEW_ID, reviewId);
    sendAmplitudeEvent(StaticConstants.CONTENT_NEW_REVIEW_ACTION, properties);
}