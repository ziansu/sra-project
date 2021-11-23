public void onClose(org.java_websocket.WebSocket conn, int code, java.lang.String reason, boolean remote) {
    java.lang.System.out.println("CONNECTION CLOSED");
    java.util.List<java.lang.String> topics = topicsPerConnection.get(conn);
    for (java.lang.String topic : topics) {
        unsubscribe(topic, conn, false);
    }
    topicsPerConnection.remove(conn);
}