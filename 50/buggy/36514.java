public static void main(java.lang.String[] args) {
    java.lang.String host = "localhost";
    int port = 4444;
    ClientChatWindow chat = new ClientChatWindow("Pablo", host, port);
    chat.run();
}