@java.lang.Override
public void onClick(android.view.View v) {
    message = editTextChat.getText().toString();
    if (!(((message) == null) || (message.equals("")))) {
        mainPresenter.sendMessage(message);
        editTextChat.setText("");
    }
}