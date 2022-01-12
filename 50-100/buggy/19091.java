public static boolean emitEvent(com.github.nkzawa.socketio.client.Socket socket, java.lang.String eventType, java.lang.Object eventObject) {
    if (eventObject == null) {
        return false;
    }
    if ((socket != null) && (socket.connected())) {
        socket.emit(eventType, eventObject);
        return true;
    }else {
        return false;
    }
}