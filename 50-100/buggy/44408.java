@java.lang.Override
public void onClick(android.view.View v) {
    message = editTextChat.getText().toString();
    senderThread = new com.anhv.gamingpc.cocc.Client.SenderThread(message);
    java.lang.Thread sent = new java.lang.Thread(senderThread);
    sent.start();
    editTextChat.setText("");
    textViewWindow.setText("");
}