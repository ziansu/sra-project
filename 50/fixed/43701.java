@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    android.util.Log.d("MyMaps", "Network onStatusChanged called");
    android.widget.Toast.makeText(this, "Network onStatusChanged called", Toast.LENGTH_SHORT).show();
}