@java.lang.Override
protected void onStart() {
    initPlayServices();
    client.connect();
    android.util.Log.d(com.example.tameter.geofog.MainActivity.LOG_TAG, "START OP XXOX");
    super.onStart();
}