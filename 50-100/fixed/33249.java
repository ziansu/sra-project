public void onClick(android.view.View v) {
    android.widget.EditText edName = ((android.widget.EditText) (findViewById(R.id.roomNameField)));
    android.widget.EditText edPass = ((android.widget.EditText) (findViewById(R.id.roomPasswordField)));
    roomManager.createRoom(edName.getText().toString(), edPass.getText().toString(), geoPoint);
}