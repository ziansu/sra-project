public void run() {
    byte[] msg;
    java.net.DatagramPacket receivePacket;
    while (true) {
        java.lang.System.out.println("SERVER: waiting..\n");
        msg = new byte[100];
        receivePacket = new java.net.DatagramPacket(msg, msg.length);
        try {
            receiveSocket.receive(receivePacket);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        java.lang.System.out.println(("SERVER: Request Received" + (java.util.Arrays.toString(receivePacket.getData()))));
        addActiveRequest(new Server.ControlThread(receivePacket));
    } 
}