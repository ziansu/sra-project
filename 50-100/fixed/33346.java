@java.lang.Override
protected void doStop() throws java.lang.Exception {
    if ((syncTransport) != null) {
        org.apache.camel.component.thrift.ThriftProducer.LOG.debug("Terminating synchronous transport the remote Thrift server");
        syncTransport.close();
        syncTransport = null;
        protocol = null;
    }else
        if ((asyncTransport) != null) {
            org.apache.camel.component.thrift.ThriftProducer.LOG.debug("Terminating asynchronous transport the remote Thrift server");
            asyncTransport.close();
            asyncTransport = null;
        }
    
    super.doStop();
}