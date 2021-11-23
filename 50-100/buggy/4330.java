public void generateMessage(java.lang.String input) {
    if (input.contains("/bye")) {
        leave();
        return ;
    }
    com.telegram.app.Message newMessage = new com.telegram.app.Message(name, input, "chat");
    int i = 0;
    while (i < (connectionCount)) {
        connections[(i++)].sendMessage(newMessage);
    } 
}