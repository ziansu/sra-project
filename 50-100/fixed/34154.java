public static void connect(java.lang.String destinationIP, int portNumber) {
    try {
        java.net.Socket peer = new java.net.Socket(destinationIP, portNumber);
        main.Main.peerList.add(new main.Peer(peer));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(((("Can not connect to " + destinationIP) + ". Error:") + (e.toString())));
    }
}