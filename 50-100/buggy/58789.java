public static void v(java.lang.String msg) {
    if ((commanutil.utl.LogManager.mIsOutLog) && ((commanutil.utl.LogManager.logLevel) >= (android.util.Log.VERBOSE))) {
        java.lang.String log = commanutil.utl.LogManager.bulidTag(msg);
        android.util.Log.v(commanutil.utl.LogManager.TAG, log);
        commanutil.utl.LogManager.outputToFile(log);
    }
}