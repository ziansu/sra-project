@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    gotoLogin();
    connect = new src.main.communication.Connect();
    receiveThread = connect.getReceiveThread();
    if (src.main.communication.Connect.hasConnect()) {
        receiveThread.setDaemon(true);
        receiveThread.start();
        messageThread.setDaemon(true);
        messageThread.start();
        chatThread.setDaemon(true);
        chatThread.start();
    }
}