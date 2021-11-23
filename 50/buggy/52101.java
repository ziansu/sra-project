@java.lang.Override
public java.lang.String checkOnline(long userId) throws org.apache.thrift.TException {
    return onlineStatusServer.query(java.lang.String.valueOf(userId));
}