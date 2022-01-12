@java.lang.Override
public void uncaughtException(java.lang.Thread thread, java.lang.Throwable ex) {
    android.util.Log.i("virgil", "-------get  uncaught exception-----------");
    if ((!(handleException(ex))) && ((mDefaultHandler) != null)) {
        mDefaultHandler.uncaughtException(thread, ex);
    }else {
        try {
            java.lang.Thread.sleep(5000);
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.sqbnet.expressassistant.CrashHandler.TAG, "virgil : ", e);
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        java.lang.System.exit(10);
    }
}