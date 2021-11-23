@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String s = "Please wait, getting coordinates,\n if it takes too long move around or go outside";
    try {
        locationManager.requestSingleUpdate("gps", listener, android.os.Looper.getMainLooper());
    } catch (java.lang.SecurityException e) {
        android.content.Context context = getApplicationContext();
        java.lang.CharSequence text = "Access denied, can't acquire permission for gps";
        int duration = android.widget.Toast.LENGTH_LONG;
        android.widget.Toast.makeText(context, text, duration).show();
    }
    t.setText(s);
}