public void onClickSend(android.view.View view) {
    android.widget.EditText msgEditText = ((android.widget.EditText) (findViewById(R.id.message_to_send)));
    java.lang.String message = msgEditText.getText().toString();
    msgEditText.setText("");
    if (!(message.equals(""))) {
        presenter.sendMessage(userCode, message);
    }
}