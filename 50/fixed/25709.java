private org.apache.zeppelin.socket.Message deserializeMessage(java.lang.String msg) {
    return gson.fromJson(msg, org.apache.zeppelin.socket.Message.class);
}