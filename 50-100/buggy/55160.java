@java.lang.Override
public void onClick(android.view.View v) {
    messageBody = messageBodyField.getText().toString();
    if (messageBody.isEmpty()) {
        android.widget.Toast.makeText(getApplicationContext(), "Please enter a message", Toast.LENGTH_LONG).show();
        return ;
    }
    messageService.sendMessage(recipientId, messageBody);
    messageBodyField.setText("");
}