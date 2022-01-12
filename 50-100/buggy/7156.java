@java.lang.Override
public javax.jms.Session createSession(boolean transacted, int ackMode) throws javax.jms.JMSException {
    org.apache.activemq.jms.pool.PooledSession result;
    result = ((org.apache.activemq.jms.pool.PooledSession) (pool.createSession(transacted, ackMode)));
    loanedSessions.add(result);
    result.addSessionEventListener(this);
    return result;
}