public java.lang.String toString() {
    return (("tcp:" + (server_socket.getInetAddress())) + ":") + (server_socket.getLocalPort());
}