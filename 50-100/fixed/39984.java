public void onEncryptButtonClick(net.yakovdavis.enigmus.View view) {
    if (((net.yakovdavis.enigmus.MainActivity.ioET.getText().toString().length()) != 0) && ((net.yakovdavis.enigmus.MainActivity.keyET.getText().toString().length()) != 0)) {
        net.yakovdavis.enigmus.MainActivity.ioET.setText(e.encrypt(net.yakovdavis.enigmus.MainActivity.ioET.getText().toString(), net.yakovdavis.enigmus.MainActivity.keyET.getText().toString()));
    }
}