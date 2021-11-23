public static com.facebook.react.bridge.WritableMap buildVRParams(boolean vrContent, boolean isStereoSupported) {
    com.facebook.react.bridge.WritableMap params = com.facebook.react.bridge.Arguments.createMap();
    params.putBoolean("vrContent", vrContent);
    params.putBoolean("stereoSupported", (vrContent && isStereoSupported));
    return params;
}