public static void log(java.lang.Throwable throwable) {
    try {
        de.robv.android.xposed.XposedBridge.log(throwable);
    } catch (java.lang.Throwable t) {
        android.util.Log.e("SNAPPREFS", ("Throwable: " + (t.getMessage())));
        t.printStackTrace();
    }
}