public static void main(java.lang.String[] args) throws java.net.SocketException {
    DEBUG.Debug.DEBUG_MODE = true;
    java.lang.System.out.println("Im running");
    DEBUG.Debug.debugln("--- BEGIN RxPServerSocketTester.main ---");
    DEBUG.Debug.debugln("creating RxPServerSocket...");
    RxP.RxPServerSocket socket = new RxP.RxPServerSocket(java.net.InetAddress.getLoopbackAddress(), 8009, java.net.InetAddress.getLoopbackAddress(), 8008);
    DEBUG.Debug.debugln("opening RxPSocketA...");
    socket.open();
    DEBUG.Debug.debugln("checking if RxPSocket is open...");
    DEBUG.Debug.debugln("--- END RxPSocketTester.main ---");
}