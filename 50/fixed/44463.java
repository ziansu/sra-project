public java.lang.String checkOnline(java.lang.String userId) throws org.apache.thrift.TException {
    send_checkOnline(userId);
    return recv_checkOnline();
}