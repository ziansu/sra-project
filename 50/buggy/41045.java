@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    if (intent.getAction().equals("GETLOCATION")) {
        android.widget.Toast.makeText(context, "in on handle intent of my location getter", Toast.LENGTH_SHORT).show();
        startLocationUpdates();
    }
}