@java.lang.Override
public void handle(javafx.stage.WindowEvent event) {
    try {
        chatController.closeAllConnections();
        java.lang.System.exit(0);
    } catch (javax.jms.JMSException e) {
        e.printStackTrace();
    }
}