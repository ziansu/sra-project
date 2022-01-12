java.util.ArrayList<java.net.DatagramPacket> receiveData(int packetsMax, java.lang.String code) {
    try {
        java.lang.System.out.println("Teste1");
        java.util.ArrayList<java.net.DatagramPacket> toReturn = runSocket(packetsMax, code);
        java.lang.System.out.println("Teste2");
        return toReturn;
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Error: " + (e.toString())));
        return null;
    }
}