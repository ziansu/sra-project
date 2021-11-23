@javax.annotation.PostConstruct
public void initConnection() {
    readerSignal = new com.ib.client.EJavaSignal();
    clientSocket = new com.ib.client.EClientSocket(this, readerSignal);
    clientSocket.eConnect(host, port, 1);
    thread = new java.lang.Thread(new hu.farago.ib.MessageReceiver(clientSocket, readerSignal, eventBus));
    thread.start();
}