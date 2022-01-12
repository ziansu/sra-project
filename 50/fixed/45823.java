@java.lang.Override
public synchronized void initialize(com.ibm.streams.operator.OperatorContext context) throws java.lang.Exception {
    super.initialize(context);
    wsServer = new com.ibm.streamsx.inet.wsserver.WSServer(portNum);
    active = true;
    wsServer.setWebSocketSink(this);
}