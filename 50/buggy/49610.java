private com.kontakt.sdk.android.ble.configuration.ScanPeriod getScanPeriod(java.lang.String mode, com.facebook.react.bridge.Promise promise) throws java.lang.Exception {
    switch (mode) {
        case "RANGING" :
            return com.kontakt.sdk.android.ble.configuration.ScanPeriod.RANGING;
        case "MONITORING" :
            return com.kontakt.sdk.android.ble.configuration.ScanPeriod.MONITORING;
        default :
            throw new java.lang.Exception("scanPeriod default value has to be either RANGING or MONITORING");
    }
}