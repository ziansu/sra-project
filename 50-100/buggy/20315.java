public void recieveData() {
    try {
        datagramSocket = new java.net.DatagramSocket(ServerThread.RECIEVER_PORT);
        byte[] data = new byte[2];
        while (true) {
            packetFromClient = new java.net.DatagramPacket(data, data.length);
            datagramSocket.receive(packetFromClient);
            server.storeData(new java.lang.String(packetFromClient.getData()));
            java.lang.System.out.println(("Recieved test data from client " + (server.getData())));
        } 
    } catch (java.io.IOException io) {
    }
}