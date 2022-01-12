@java.lang.Override
public void onClick(android.view.View v) {
    com.example.mac.bugfree.util.InternetConnectionChecker checker = new com.example.mac.bugfree.util.InternetConnectionChecker();
    android.content.Context context = getApplicationContext();
    final boolean isOnline = checker.isOnline(context);
    if (!isOnline) {
        currentLocationCheckbox.setChecked(false);
        android.widget.Toast.makeText(getApplicationContext(), "Location is not available when this device is offline.", Toast.LENGTH_LONG).show();
    }
    add_location();
}