public static void log(java.lang.String origin, java.lang.String message) {
    java.io.File logFile = null;
    if (mega.privacy.android.app.utils.Util.DEBUG) {
        nz.mega.sdk.MegaApiAndroid.log(MegaApiAndroid.LOG_LEVEL_INFO, message, origin);
    }
}