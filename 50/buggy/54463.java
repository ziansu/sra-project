@java.lang.Override
public void finalize() throws java.lang.Throwable {
    if (Logger.DEBUG) {
        android.util.Log.d(TAG, "[finalize]");
    }
    cleanup();
    super.finalize();
}