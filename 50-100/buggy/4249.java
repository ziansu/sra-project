@java.lang.Override
public void run() {
    while (true) {
        if (tcpConnection.connectionActive()) {
            java.lang.String message = tcpConnection.receive();
            if (message != null) {
                java.lang.System.out.println(message);
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