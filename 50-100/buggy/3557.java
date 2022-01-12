@java.lang.Override
public void run() {
    for (int i = 0; i < 20; i++) {
        java.lang.String toAddress = "192.168.1.69";
        java.lang.String message = "Dave";
        this.portManager.senderPutMessage(this.myAddress, new com.zetaphase.network.Message(message, toAddress));
        java.lang.System.out.println("I am sending the message!");
        java.lang.System.out.println(portManager.senderPorts);
        java.lang.System.out.println(portManager.receiverPorts);
        try {
            java.lang.Thread.sleep(3000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}