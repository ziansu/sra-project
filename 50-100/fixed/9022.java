public void run(int port, int timeOut) {
    printInit(port, timeOut);
    try {
        serverSocket = new java.net.ServerSocket(port);
        serverSocket.setSoTimeout(timeOut);
        socket = serverSocket.accept();
        printWelcome();
        htw.lab04.app.MessageReceiver messageReceiver = new htw.lab04.app.MessageReceiver(socket);
        htw.lab04.app.MessageSender messageSender = new htw.lab04.app.MessageSender(socket);
        messageSender.start();
        messageReceiver.start();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}