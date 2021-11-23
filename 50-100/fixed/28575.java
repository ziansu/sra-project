@java.lang.Override
public java.lang.Object getRequestProcessor(final org.apache.xmlrpc.XmlRpcRequest pRequest) throws org.apache.xmlrpc.XmlRpcException {
    final org.apache.xmlrpc.common.XmlRpcHttpRequestConfig config = ((org.apache.xmlrpc.common.XmlRpcHttpRequestConfig) (pRequest.getConfig()));
    final org.exist.security.Subject user = authenticate(config.getBasicUserName(), config.getBasicPassword());
    return new org.exist.xmlrpc.RpcConnection(this, user);
}