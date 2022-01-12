@java.lang.Override
public void run() {
    while (connected) {
        try {
            java.lang.String message = in.readLine();
            java.lang.System.out.println(("ici : " + message));
            player.getMessageFromClient(message);
        } catch (java.io.IOException ex) {
            connected = false;
            player.getMessageFromClient("disconnected");
        }
    } 
}