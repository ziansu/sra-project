@java.lang.Override
public void onStop() {
    super.onStop();
    if (gapiClient.isConnected()) {
        gapiClient.disconnect();
        android.widget.Toast.makeText(this, "Compass gapiClient.disconnect();", Toast.LENGTH_SHORT).show();
    }
}