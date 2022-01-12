public void run(int port, int timeOut) {
    printInit(port, timeOut);
    try {
        serverSocket = new java.net.ServerSocket(port);
        serverSocket.setSoTimeout(timeOut);
        socket = serverSocket.accept();
        printWelcome();
        java.lang.Thread messageReceiver = new htw.lab04.app.MessageReceiver(socket);
        java.lang.Thread messageSender = new htw.lab04.app.MessageSender(socket);
        messageSender.start();
        messageReceiver.start();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}