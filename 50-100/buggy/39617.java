public static void i(java.lang.String objectName, java.lang.String methodName, java.lang.String msg) {
    if ((commanutil.utl.LogManager.mIsOutLog) && ((commanutil.utl.LogManager.logLevel) >= (android.util.Log.INFO))) {
        final java.lang.String log = (commanutil.utl.LogManager.bulidTag(objectName, methodName)) + msg;
        android.util.Log.i(commanutil.utl.LogManager.TAG, log);
        commanutil.utl.LogManager.outputToFile(log);
    }
}