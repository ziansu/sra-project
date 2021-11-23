private void ratingAmplitudeEvent(java.lang.String ratingCount) {
    java.util.HashMap<java.lang.String, java.lang.String> properties = new java.util.HashMap<java.lang.String, java.lang.String>();
    properties.put(StaticConstants.RATING_COUNT, ratingCount);
    sendAmplitudeEvent(StaticConstants.CONTENT_RATING_CLICK, properties);
}