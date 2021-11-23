public void startReceivingToken(android.view.View view) {
    isStarted = true;
    updateButtons();
    tokenValueTextView.setText("");
    title22.setText("Awaiting Transfer...");
    startReceiverService();
}