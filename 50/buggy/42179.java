@java.lang.Override
protected javax.jms.QueueConnectionFactory createConnectionFactory() {
    return jantje(props.getString("jndiQueuemanager"));
}