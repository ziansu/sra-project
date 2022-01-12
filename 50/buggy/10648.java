public void start(I iface, lk.filetributed.client.rpc.services.services.mergeFileTable_args args, org.apache.thrift.async.AsyncMethodCallback<lk.filetributed.client.rpc.services.messageProtocol> resultHandler) throws org.apache.thrift.TException {
    iface.mergeFileTable(args.ipAddress, args.port, args.clusterID, args.fileTableEntries, resultHandler);
}