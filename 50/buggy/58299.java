public void startThreads() {
    new ayapplications.chat.sendThread(socket, username, serverAddress, serverPort, chatTextView, sendBox, sendButton).start();
    new ayapplications.chat.recThread(socket, chatTextView, tC).start();
}