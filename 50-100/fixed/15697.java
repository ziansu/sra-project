public void handleSend(android.view.View view) {
    {
        try {
            com.example.shopov.vx_serial.MainActivity.port.write(new java.lang.String(((android.widget.EditText) (findViewById(R.id.editTextVxDataToSend))).getText().toString()).getBytes(), 2000);
            ((android.widget.EditText) (findViewById(R.id.editTextVxDataToSend))).getText().clear();
        } catch (java.lang.Exception e) {
            android.util.Log.e("shopov", "shopov exception");
            e.printStackTrace();
        }
    }
}