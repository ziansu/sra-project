private void SendFile(java.lang.String message, int filePort, java.lang.String IP) {
    java.lang.String[] tmp = message.split("n");
    java.lang.String filePath = tmp[0];
    long size = java.lang.Integer.parseInt(tmp[1]);
    Client.Send send = new Client.Send(filePath, filePort, IP, size);
    send.start();
    al_send.add(send);
}