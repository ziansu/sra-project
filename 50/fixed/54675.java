@com.facebook.react.bridge.ReactMethod
public void trackEventWithCustomDimensionValues(java.lang.String trackerId, java.lang.String category, java.lang.String action, com.facebook.react.bridge.ReadableMap optionalValues, com.facebook.react.bridge.ReadableMap dimensionIndexValues) {
    this.trackEventWithCustomDimensionAndMetricValues(trackerId, category, action, optionalValues, dimensionIndexValues, null);
}