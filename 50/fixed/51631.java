@java.lang.Override
protected void onStart() {
    super.onStart();
    setLocationEnabled(false);
    setLocation(null);
    android.util.Log.i(io.github.fvasco.pinpoi.MainActivity.class.getSimpleName(), ("locationACG.status " + (locationEnabled)));
}