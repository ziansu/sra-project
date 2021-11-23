public void receiveMessage(int id, com.telegram.app.Message message) {
    java.lang.System.out.println((((((message.timestamp) + " :  ") + (message.author)) + ":  ") + (message.messageContent)));
    int i = 0;
    while (i < (connectionCount)) {
        if ((connections[i].id) != id) {
            connections[(i++)].sendMessage(message);
        }
    } 
}