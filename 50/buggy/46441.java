@java.lang.Override
public javax.jms.Session createSession(boolean transacted, int acknowledgeMode) throws javax.jms.JMSException {
    if (transacted && (isTransactionAvailable())) {
        return createAndEnlistSession();
    }
    return this.xaConnection.createSession(transacted, acknowledgeMode);
}