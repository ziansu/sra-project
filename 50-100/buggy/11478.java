protected final java.net.Socket getRootSocket(java.lang.Object target) {
    org.apache.thrift.transport.TNonblockingTransport inTrans = ((com.navercorp.pinpoint.plugin.thrift.field.getter.TNonblockingTransportFieldGetter) (target))._$PINPOINT$_getTNonblockingTransport();
    if (inTrans != null) {
        if (inTrans instanceof com.navercorp.pinpoint.plugin.thrift.field.accessor.SocketFieldAccessor) {
            return ((com.navercorp.pinpoint.plugin.thrift.field.accessor.SocketFieldAccessor) (inTrans))._$PINPOINT$_getSocket();
        }else {
            if (isDebug) {
                logger.debug("Invalid target object. Need field accessor({}).", com.navercorp.pinpoint.plugin.thrift.field.accessor.SocketFieldAccessor.class.getName());
            }
        }
    }
    return null;
}