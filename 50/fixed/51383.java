public void returnTransport(org.apache.thrift.protocol.TProtocol obj) {
    if ((((pool) != null) && (obj != null)) && (obj.getTransport().isOpen()))
        pool.returnObject(obj);
    
}