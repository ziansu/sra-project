public void sendMessage(java.lang.String ip, java.lang.String text) {
    try {
        java.net.DatagramSocket datagramSocket = new java.net.DatagramSocket();
        java.net.InetAddress destinationIp = java.net.InetAddress.getByName(ip);
        java.net.DatagramPacket packet = new java.net.DatagramPacket(text.getBytes(), text.getBytes().length, destinationIp, 7777);
        datagramSocket.send(packet);
        datagramSocket.close();
        java.lang.System.out.println("Done");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}