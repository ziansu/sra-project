private void sendMessage() {
    messageBody = messageBodyField.getText().toString();
    if (messageBody.isEmpty()) {
        android.widget.Toast.makeText(this, "Please enter a message", Toast.LENGTH_LONG).show();
        return ;
    }
    messageService.sendMessage(recipientId, messageBody);
    messageBodyField.setText("");
}