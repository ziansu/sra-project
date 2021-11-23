@java.lang.Override
public void run() {
    while (true) {
        java.lang.String msg = input.nextLine();
        java.lang.System.out.println(msg);
        gui.messageArrived(msg);
        if (msg.equals(ProtocolStrings.STOP)) {
            try {
                socket.close();
            } catch (java.io.IOException ex) {
                java.util.logging.Logger.getLogger(echoclient.EchoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    } 
}