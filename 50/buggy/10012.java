public void start(I iface, lk.filetributed.client.rpc.services.services.joinRequest_args args, org.apache.thrift.async.AsyncMethodCallback<lk.filetributed.client.rpc.services.messageProtocol> resultHandler) throws org.apache.thrift.TException {
    iface.joinRequest(args.ipAddress, args.port, args.clusterID, resultHandler);
}