@java.lang.Override
public void run() {
    java.lang.reflect.Method method = methods.get(action);
    android.util.Log.d(TAG, ("----> method = " + action));
    try {
        method.invoke(this, args, callbackContext);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        callbackContext.error(("" + (e.getMessage())));
    }
}