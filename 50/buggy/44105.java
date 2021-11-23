@java.lang.Override
public void onStart() {
    super.onStart();
    gapiClient.connect();
    android.widget.Toast.makeText(this, "gapiClient.connect()", Toast.LENGTH_SHORT).show();
}