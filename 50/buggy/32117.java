public boolean isRunnable() {
    boolean result = ((java.lang.Thread.currentThread()) == (getThreadObject())) ? true : false;
    android.util.Log.i("ThreadCore=", (result + ""));
    return result;
}