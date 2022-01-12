@java.lang.Override
public void writeMapEnd() throws org.apache.thrift.TException {
    java.util.Stack<org.breizhbeans.thrift.tools.thriftmongobridge.protocol.ThriftIO> thriftIOStack = org.breizhbeans.thrift.tools.thriftmongobridge.protocol.TBSONUnstackedProtocol.threadSafeSIOStack.get();
    org.breizhbeans.thrift.tools.thriftmongobridge.protocol.ThriftIO mapThriftIO = thriftIOStack.pop();
    org.breizhbeans.thrift.tools.thriftmongobridge.protocol.ThriftFieldMetadata field = peekWriteField();
    org.breizhbeans.thrift.tools.thriftmongobridge.protocol.ThriftIO documentThriftIO = thriftIOStack.peek();
    documentThriftIO.mongoIO.put(field.tfield.name, mapThriftIO.mongoIO);
    documentThriftIO.securedMongoIO.put(java.lang.Short.toString(field.tfield.id), mapThriftIO.securedMongoIO);
}