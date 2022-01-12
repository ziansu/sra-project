@java.lang.Override
public javax.jms.QueueReceiver createReceiver(javax.jms.Queue queue) throws javax.jms.JMSException {
    checkClosed();
    org.apache.qpid.jms.JmsSession.checkDestination(queue);
    org.apache.qpid.jms.JmsDestination dest = org.apache.qpid.jms.message.JmsMessageTransformation.transformDestination(connection, queue);
    org.apache.qpid.jms.JmsQueueReceiver result = new org.apache.qpid.jms.JmsQueueReceiver(getNextConsumerId(), this, dest, null);
    result.init();
    return result;
}