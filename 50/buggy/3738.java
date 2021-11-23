private com.kontakt.sdk.android.ble.configuration.ActivityCheckConfiguration getActivityCheckConfiguration(java.lang.String mode, com.facebook.react.bridge.Promise promise) throws java.lang.Exception {
    switch (mode) {
        case "DISABLED" :
            return com.kontakt.sdk.android.ble.configuration.ActivityCheckConfiguration.DISABLED;
        case "MINIMAL" :
            return com.kontakt.sdk.android.ble.configuration.ActivityCheckConfiguration.MINIMAL;
        case "DEFAULT" :
            return com.kontakt.sdk.android.ble.configuration.ActivityCheckConfiguration.DEFAULT;
        default :
            throw new java.lang.Exception("activityCheckConfiguration default value has to be either DISABLED, MINIMAL or DEFAULT");
    }
}