private void send(int id, byte[] contents, java.lang.String ip) {
    try {
        byte[] array = edu.mst.marsrover.redmobile.rovecomm.RoveProtocol.encodePacket(id, contents, 1123, true);
        android.util.Log.e("Rove Comm", ("Sending bytes: " + (java.util.Arrays.toString(array))));
        datagramSocket.send(new java.net.DatagramPacket(array, contents.length, java.net.InetAddress.getByName(ip), edu.mst.marsrover.redmobile.rovecomm.RoveComm.PORT));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}