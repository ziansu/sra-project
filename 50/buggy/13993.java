public lk.filetributed.client.rpc.services.messageProtocol joinRequest(java.lang.String ipAddress, int port, int clusterID) throws org.apache.thrift.TException {
    send_joinRequest(ipAddress, port, clusterID);
    return recv_joinRequest();
}