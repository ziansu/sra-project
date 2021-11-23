@java.lang.Override
public void onRemoteClose(org.apache.qpid.proton.engine.Connection connection) {
    synchronized(getLock()) {
        connection.close();
        connection.free();
        for (org.apache.activemq.artemis.protocol.amqp.proton.AMQPSessionContext protonSession : sessions.values()) {
            protonSession.close();
        }
        sessions.clear();
    }
    onTransport(handler.getTransport());
    destroy();
}