private static void upload() throws java.lang.Exception {
    byte[] receiveData = new byte[1024];
    java.net.DatagramPacket receivePacket = new java.net.DatagramPacket(receiveData, receiveData.length);
    csci4311.nc.NetcatUDPServer.serverSocket.receive(receivePacket);
    java.lang.System.out.println(java.util.Arrays.toString(receivePacket.getData()));
}