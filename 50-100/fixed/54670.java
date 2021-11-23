@java.lang.Override
public void close() throws java.io.IOException {
    java.lang.String fromServer;
    boolean quit = false;
    if (!(connected)) {
        return ;
    }
    try {
        socketFacade.writeLine("QUIT");
        while ((!quit) && ((fromServer = socketFacade.readLine()) != null)) {
            java.lang.System.out.println(("close > " + fromServer));
            if (fromServer.startsWith("221")) {
                quit = true;
            }
        } 
    } finally {
        socketFacade.close();
    }
    this.connected = false;
}