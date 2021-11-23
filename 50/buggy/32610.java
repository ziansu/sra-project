public void connect(android.view.View view) {
    android.widget.EditText edip = ((android.widget.EditText) (findViewById(R.id.editTextIP)));
    cw = new com.example.message_streamer.connection_worker(this, edip.getText().toString(), "1234");
}