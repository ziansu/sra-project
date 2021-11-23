@java.lang.Override
public void run() {
    try {
        java.net.InetAddress addr = java.net.InetAddress.getByName(ipAddress);
        server = new java.net.Socket();
        server.connect(new java.net.InetSocketAddress(addr, 50001));
        server.getOutputStream().write("TEST".getBytes());
    } catch (java.lang.Exception ex) {
        android.util.Log.e("networking", "Failed to open connection negotiator", ex);
    }
}