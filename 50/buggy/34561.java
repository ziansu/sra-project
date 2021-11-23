@java.lang.Override
protected void onStop() {
    super.onStop();
    save();
    android.widget.Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_LONG).show();
}