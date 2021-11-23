private com.kontakt.sdk.android.ble.configuration.ScanMode getScanMode(int mode, com.facebook.react.bridge.Promise promise) throws java.lang.Exception {
    switch (mode) {
        case 0 :
            return com.kontakt.sdk.android.ble.configuration.ScanMode.LOW_POWER;
        case 1 :
            return com.kontakt.sdk.android.ble.configuration.ScanMode.BALANCED;
        case 2 :
            return com.kontakt.sdk.android.ble.configuration.ScanMode.LOW_LATENCY;
        default :
            throw new java.lang.Exception("The value of scanMode has to be either LOW_POWER, BALANCED or LOW_LATENCY");
    }
}