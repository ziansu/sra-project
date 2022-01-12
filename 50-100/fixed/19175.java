public void onReceiveRequest(java.lang.String[] input) {
    int serverId = java.lang.Integer.parseInt(input[2]);
    int time = java.lang.Integer.parseInt(input[3]);
    myServer.clock.receiveAction(time);
    int id = java.lang.Integer.parseInt(input[4]);
    java.lang.System.out.println(input);
    java.lang.String[] reqTokens = input[5].split("\\s");
    ServerUpdateRequest request = new ServerUpdateRequest(serverId, time, id, reqTokens);
    myServer.insertToPendingQueue(request);
    sendAck(id);
}