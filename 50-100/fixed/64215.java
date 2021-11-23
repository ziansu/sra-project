public static void i(java.lang.String msg) {
    if ((commanutil.utl.LogManager.mIsOutLog) && ((commanutil.utl.LogManager.logLevel) <= (android.util.Log.INFO))) {
        java.lang.String log = commanutil.utl.LogManager.bulidTag(msg);
        android.util.Log.i(commanutil.utl.LogManager.TAG, log);
        commanutil.utl.LogManager.outputToFile(log);
    }
}