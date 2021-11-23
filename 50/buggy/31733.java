@java.lang.Override
public void onActivityStarted(android.app.Activity activity) {
    android.util.Log.i("BACKGROUND", "started");
    ++(start);
}