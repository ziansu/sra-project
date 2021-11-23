protected void RecupereObjet(java.lang.String chemin) throws java.io.IOException {
    java.net.Socket sock = new java.net.ServerSocket(getPort()).accept();
    sock.close();
}