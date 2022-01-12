public lk.filetributed.client.rpc.services.messageProtocol joinRequest(java.lang.String ipAddress, int port) throws org.apache.thrift.TException {
    send_joinRequest(ipAddress, port);
    return recv_joinRequest();
}