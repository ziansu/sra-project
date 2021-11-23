public void sendFile(java.lang.String content) {
    send("SOF\n");
    send(content);
    send("EOF\n");
}