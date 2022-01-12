@java.lang.Override
public void run() {
    while (true) {
        if (tcpConnection.connectionActive()) {
            java.lang.String message = tcpConnection.receive();
            if (message != null) {
                parseIncoming(message);
            }
            try {
                java.lang.Thread.sleep(10);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 
}