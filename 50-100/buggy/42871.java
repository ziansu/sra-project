private void setStatus(final java.lang.String messageText, boolean wasSuccessful) {
    final android.widget.TextView buttonText = ((android.widget.TextView) (findViewById(R.id.button_text)));
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(com.ibm.hellopush.MainActivity.this, "Device Registered Successfully ", Toast.LENGTH_LONG).show();
            android.widget.Toast.makeText(com.ibm.hellopush.MainActivity.this, "You are Connected ", Toast.LENGTH_LONG).show();
        }
    });
}