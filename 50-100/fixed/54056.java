@java.lang.Override
public void EmergencySend(byte[] data) throws com.ANT.MiddleWare.Entities.FileFragment.FileFragmentException, java.io.IOException {
    com.ANT.MiddleWare.Entities.FileFragment f = new com.ANT.MiddleWare.Entities.FileFragment(numIP, data.length, com.ANT.MiddleWare.WiFi.WiFiBroad.WiFiBroad.EMERGEN_SEND_TAG, (-1));
    f.setData(data);
    data = f.toBytes();
    java.net.DatagramPacket dp = new java.net.DatagramPacket(data, data.length, java.net.InetAddress.getByName(com.ANT.MiddleWare.WiFi.WiFiBroad.WiFiBroad.multicastHost), com.ANT.MiddleWare.WiFi.WiFiBroad.WiFiBroad.localPort);
    synchronized(taskList) {
        socket.send(dp);
    }
}