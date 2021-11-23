@java.lang.Override
public void run() {
    while (connected) {
        try {
            java.lang.String message = in.readLine();
            player.getMessageFromClient(message);
        } catch (java.io.IOException ex) {
            connected = false;
        }
    } 
}