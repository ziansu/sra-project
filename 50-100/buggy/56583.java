@java.lang.Override
public void uncaughtException(java.lang.Thread thread, java.lang.Throwable throwable) {
    if ((!(handleException(throwable))) && ((mDefaultUncaughtExceptionHandler) != null)) {
        mDefaultUncaughtExceptionHandler.uncaughtException(thread, throwable);
    }else {
        try {
            java.lang.Thread.sleep(3000);
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.sqbnet.expressassistant.CrashHandler.TAG, "virgil", e);
        }
        java.lang.Process.killProcess(java.lang.Process.myPid());
        java.lang.System.exit(1);
    }
}