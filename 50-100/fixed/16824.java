public void joinRequest(java.lang.String ipAddress, int port, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
    checkReady();
    lk.filetributed.client.rpc.services.services.AsyncClient.joinRequest_call method_call = new lk.filetributed.client.rpc.services.services.AsyncClient.joinRequest_call(ipAddress, port, resultHandler, this, ___protocolFactory, ___transport);
    this.___currentMethod = method_call;
    ___manager.call(method_call);
}