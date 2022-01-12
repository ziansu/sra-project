public static boolean isGpsHardwarePresent(android.content.Context context) {
    try {
        return com.jstakun.gms.android.location.LocationServicesManager.HelperInternal.isGpsHardwarePresent(context);
    } catch (java.lang.VerifyError e) {
        return true;
    }
}