public void startReceivingToken(android.view.View view) {
    isStarted = true;
    updateButtons();
    startReceiverService();
    tokenValueTextView.setText("");
    title22.setText("Awaiting Transfer...");
}