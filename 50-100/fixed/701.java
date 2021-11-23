public static void Initialize(java.lang.String namespace, boolean verbose) {
    com.urucas.logcatio.LogcatIO logcatIO = com.urucas.logcatio.LogcatIO.getInstance();
    logcatIO.log("Logcat.io instance created");
    logcatIO.VERBOSE = verbose;
    logcatIO.NAMESPACE = namespace;
    logcatIO.SDK = Build.VERSION.SDK_INT;
    logcatIO.BRAND = android.os.Build.BRAND;
    logcatIO.MANUFACTURER = android.os.Build.MANUFACTURER;
    logcatIO.MODEL = android.os.Build.MODEL;
    logcatIO.SERIAL = android.os.Build.SERIAL;
    logcatIO.createSocketConnection();
    logcatIO.createTimerTask();
}