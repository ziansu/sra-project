@java.lang.Override
public void run() {
    while (!(isStoped)) {
        utils.adt.NetworkToken token = buffer.getMessageFromInput();
        if (token != null) {
            client.connectionManager.Connection client = connectionMap.get(token.getID());
            if (client != null) {
                client.sendMessage(token.getMessage());
            }
        }
    } 
    java.lang.System.out.println("Answerhandler heruntergefahren");
}