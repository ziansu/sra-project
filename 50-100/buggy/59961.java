private void handleInit(edu.cmu.ece845.utility.Message msg) {
    int port = java.lang.Integer.valueOf(msg.getData().getValue());
    java.lang.System.out.println((((("the node:" + (this.nodeId)) + " is listening on port:") + port) + " for other nodes"));
    this.hiringServer.nodeComPortMap.put(this.nodeId, port);
}