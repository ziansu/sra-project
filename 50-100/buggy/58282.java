public void run() {
    byte[] msg = new byte[100];
    java.net.DatagramPacket receivePacket = new java.net.DatagramPacket(msg, msg.length);
    while (true) {
        java.lang.System.out.println("SERVER: waiting..\n");
        try {
            receiveSocket.receive(receivePacket);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        java.lang.System.out.println(("SERVER: Request Received" + (java.util.Arrays.toString(msg))));
        addActiveRequest(new Server.ControlThread(receivePacket));
    } 
}