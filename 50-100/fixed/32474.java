public void saveEmailAddress(android.view.View view) {
    senderEmail = senderEmailText.getText().toString();
    senderPassword = senderPasswordText.getText().toString();
    recepientEmail = recipientEmailText.getText().toString();
    startButton.setEnabled(true);
    endButton.setEnabled(false);
    saveEmailButton.setEnabled(false);
    senderEmailText.setEnabled(false);
    senderPasswordText.setEnabled(false);
    recipientEmailText.setEnabled(false);
}