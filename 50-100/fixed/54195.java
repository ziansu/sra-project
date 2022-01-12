public void register(io.socket.SocketIO socket) {
    java.lang.String namespace = socket.getNamespace();
    if (sockets.containsKey(namespace))
        socket.getCallback().onError(new io.socket.SocketIOException((("Namespace '" + namespace) + "' is already registered. Do not try to connect twice to the same url.")));
    else
        sockets.put(namespace, socket);
    
}