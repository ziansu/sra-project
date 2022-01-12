public void joinRequest(java.lang.String ipAddress, int port, int clusterID, org.apache.thrift.async.AsyncMethodCallback<lk.filetributed.client.rpc.services.JoinNode.AsyncClient.joinRequest_call> resultHandler) throws org.apache.thrift.TException {
    checkReady();
    lk.filetributed.client.rpc.services.JoinNode.AsyncClient.joinRequest_call method_call = new lk.filetributed.client.rpc.services.JoinNode.AsyncClient.joinRequest_call(ipAddress, port, clusterID, resultHandler, this, ___protocolFactory, ___transport);
    this.___currentMethod = method_call;
    ___manager.call(method_call);
}