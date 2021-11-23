@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(this, "Started Cam", Toast.LENGTH_SHORT).show();
    qrScan.initiateScan();
}