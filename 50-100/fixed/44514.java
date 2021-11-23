public void initSocketConnection() throws java.io.IOException {
    java.net.Socket s = new java.net.Socket(address, port);
    dis = new java.io.DataInputStream(s.getInputStream());
    dos = new java.io.DataOutputStream(s.getOutputStream());
    new standard.lab9.ChatHandlerClientReadThread(dis, txtChatHistory).start();
}