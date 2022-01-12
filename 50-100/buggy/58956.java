public void send_mergeFileTable(java.lang.String ipAddress, int port, int clusterID, java.lang.String fileTableEntries) throws org.apache.thrift.TException {
    lk.filetributed.client.rpc.services.services.mergeFileTable_args args = new lk.filetributed.client.rpc.services.services.mergeFileTable_args();
    args.setIpAddress(ipAddress);
    args.setPort(port);
    args.setClusterID(clusterID);
    args.setFileTableEntries(fileTableEntries);
    sendBase("mergeFileTable", args);
}