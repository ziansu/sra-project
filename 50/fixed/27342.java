@java.lang.Override
public void uncaughtException(java.lang.Thread thread, java.lang.Throwable throwable) {
    throwable.printStackTrace();
    android.util.Log.e(logTag, throwable.getLocalizedMessage());
}