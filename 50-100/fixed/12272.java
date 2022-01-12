@java.lang.SuppressWarnings(value = "Duplicates")
private static void upload(int port) throws java.lang.Exception {
    byte[] sendData = new byte[1024];
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    while (input.hasNextLine()) {
        sendData = input.nextLine().getBytes();
        csci4311.nc.NetcatUDPClient.clientSocket.send(new java.net.DatagramPacket(sendData, sendData.length, csci4311.nc.NetcatUDPClient.ipAddress, port));
    } 
}