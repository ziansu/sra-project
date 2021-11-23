@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    android.widget.Toast t = android.widget.Toast.makeText(getApplicationContext(), java.lang.Integer.toString(status), Toast.LENGTH_SHORT);
    t.show();
}