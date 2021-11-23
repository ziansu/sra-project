public static void printStackTrace(java.lang.Exception e, java.lang.String objectName, java.lang.String methodName) {
    if ((commanutil.utl.LogManager.mIsOutLog) && ((commanutil.utl.LogManager.logLevel) <= (android.util.Log.WARN))) {
        commanutil.utl.LogManager.e(objectName, methodName, commanutil.utl.LogManager.TAG_EXCEPTION);
        commanutil.utl.LogManager.e(objectName, methodName, e.toString());
        e.printStackTrace();
        if (commanutil.utl.LogManager.mIsOutToFile) {
            commanutil.utl.LogManager.outputToFile(e);
        }
    }
}