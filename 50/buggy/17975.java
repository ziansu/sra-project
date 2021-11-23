@java.lang.Override
public void onOpen(org.java_websocket.WebSocket conn, org.java_websocket.handshake.ClientHandshake handshake) {
    java.lang.System.out.println(((conn.getRemoteSocketAddress().getAddress().getHostAddress()) + " entered the room!"));
}