@java.lang.Override
public javax.jms.TopicPublisher createPublisher(javax.jms.Topic topic) throws javax.jms.JMSException {
    checkClosed();
    org.apache.qpid.jms.JmsDestination dest = org.apache.qpid.jms.message.JmsMessageTransformation.transformDestination(connection, topic);
    org.apache.qpid.jms.JmsTopicPublisher result = new org.apache.qpid.jms.JmsTopicPublisher(getNextProducerId(), this, dest);
    return result;
}