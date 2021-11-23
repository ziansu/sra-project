@java.lang.Override
public void initService() {
    try {
        this.connection.start();
    } catch (javax.jms.JMSException e) {
        throw new org.aludratest.exception.TechnicalException("Could not start connection", e);
    }
}