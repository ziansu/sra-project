@java.lang.Override
public synchronized void initialize(com.ibm.streams.operator.OperatorContext context) throws java.lang.Exception {
    super.initialize(context);
    setBatchSize(getBatchSize());
    wsServer = new com.ibm.streamsx.inet.wsserver.WSServer(portNum);
    active = true;
    wsServer.setWebSocketSink(this);
}