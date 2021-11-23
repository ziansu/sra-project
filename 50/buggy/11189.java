@java.lang.Override
public void onNetworkConnected() {
    android.util.Log.e("Network", "Network CONNNNNECTED");
    android.widget.Toast.makeText(this, "Connected", Toast.LENGTH_SHORT).show();
    sendLocation();
}