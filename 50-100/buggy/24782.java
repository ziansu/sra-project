public void mergeFileTable(java.lang.String ipAddress, int port, int clusterID, java.lang.String fileTableEntries, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
    checkReady();
    lk.filetributed.client.rpc.services.services.AsyncClient.mergeFileTable_call method_call = new lk.filetributed.client.rpc.services.services.AsyncClient.mergeFileTable_call(ipAddress, port, clusterID, fileTableEntries, resultHandler, this, ___protocolFactory, ___transport);
    this.___currentMethod = method_call;
    ___manager.call(method_call);
}