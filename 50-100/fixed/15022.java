@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String text = textEdit.getText().toString();
    if (!(text.isEmpty())) {
        chatMessage.setMessage(text);
        com.benjaminearley.hackproject.App.getMessagesRef(name).push().setValue(chatMessage);
        textEdit.setText("");
        chatMessage.setMessage("");
    }
}