public void startThreads() {
    new ayapplications.chat.sendThread(socket, username, serverAddress, serverPort, chatTextView, sendBox, sendButton, tC).start();
    new ayapplications.chat.recThread(socket, serverAddress, serverPort, chatTextView, tC).start();
}