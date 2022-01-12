public static void d(java.lang.String objectName, java.lang.String methodName, java.lang.String msg) {
    if ((commanutil.utl.LogManager.mIsOutLog) && ((commanutil.utl.LogManager.logLevel) >= (android.util.Log.DEBUG))) {
        final java.lang.String log = (commanutil.utl.LogManager.bulidTag(objectName, methodName)) + msg;
        android.util.Log.d(commanutil.utl.LogManager.TAG, log);
        commanutil.utl.LogManager.outputToFile(log);
    }
}