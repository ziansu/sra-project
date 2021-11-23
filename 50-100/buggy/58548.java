public static boolean connectionStatus() {
    boolean flag = false;
    try {
        java.net.Socket socket = new java.net.Socket();
        socket.connect(new java.net.InetSocketAddress(cliente.BuscarServidor.serverHost, 4500), 500);
        socket.close();
        flag = true;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Error al conectar");
    }
    return flag;
}