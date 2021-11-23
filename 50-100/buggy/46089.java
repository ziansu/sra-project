public static void printStackTrace() {
    if ((commanutil.utl.LogManager.mIsOutLog) && ((commanutil.utl.LogManager.logLevel) >= (android.util.Log.WARN)))
        for (java.lang.StackTraceElement e : java.lang.Thread.currentThread().getStackTrace()) {
            android.util.Log.e(commanutil.utl.LogManager.TAG, (((((e.getFileName()) + "|") + (e.getMethodName())) + "|") + (e.getLineNumber())));
        }
    
}