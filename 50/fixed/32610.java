public void connect(android.view.View view) {
    android.widget.EditText edip = ((android.widget.EditText) (findViewById(R.id.editTextIP)));
    cw.connect(edip.getText().toString(), "1234");
}