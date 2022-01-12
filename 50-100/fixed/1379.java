@java.lang.Override
public void onData(com.corundumstudio.socketio.SocketIOClient client, SearchObject data, com.corundumstudio.socketio.AckRequest ackRequest) {
    long startTime = java.lang.System.currentTimeMillis();
    java.util.Map<java.lang.String, java.lang.Object>[] results = eClient.search(data);
    long estimatedTime = (java.lang.System.currentTimeMillis()) - startTime;
    java.lang.System.out.println((("Execution time: " + estimatedTime) + "ms"));
    ackRequest.sendAckData(results);
}