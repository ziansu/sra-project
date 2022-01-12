private void run() throws java.io.IOException {
    registryCon.send(new cs455.overlay.node.OverlayNodeSendsRegistration(java.net.InetAddress.getLocalHost(), getPort()));
    server.start();
    while (true) {
        java.lang.String[] command = commandParser.receiveCommand();
        handleCommand(command);
    } 
}