@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.widget.Toast.makeText(this, (("Service is stopped " + (timeInMilliseconds)) + " miliseconds"), Toast.LENGTH_LONG).show();
}