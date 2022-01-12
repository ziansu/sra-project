@java.lang.Override
public com.arjuna.ats.jta.distributed.server.impl.ProxyXAResource generateProxyXAResource(java.lang.String remoteServerName, javax.transaction.xa.Xid migratedXid) throws java.io.IOException, javax.transaction.SystemException {
    return new com.arjuna.ats.jta.distributed.server.impl.ProxyXAResource(nodeName, remoteServerName, migratedXid, false);
}