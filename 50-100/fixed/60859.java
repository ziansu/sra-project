public void run() {
    int port = 9042;
    java.lang.String destHost = "localhost";
    printInit(destHost, port);
    try {
        client = new java.net.Socket(destHost, port);
        printConnected(destHost, port);
        htw.lab04.app.MessageReceiver messageReceiver = new htw.lab04.app.MessageReceiver(client);
        htw.lab04.app.MessageSender messageSender = new htw.lab04.app.MessageSender(client);
        messageSender.start();
        messageReceiver.start();
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}