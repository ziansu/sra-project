java.util.ArrayList<java.net.DatagramPacket> receiveData(int packetsMax, java.lang.String code) {
    try {
        java.util.ArrayList<java.net.DatagramPacket> toReturn = runSocket(packetsMax, code);
        return toReturn;
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Error: " + (e.toString())));
        return null;
    }
}