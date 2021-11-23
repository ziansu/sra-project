@java.lang.Override
public void onMessage(javax.jms.Message message) {
    try {
        java.lang.System.out.println(((javax.jms.ObjectMessage) (message)).getStringProperty("text"));
    } catch (javax.jms.JMSException ex) {
        throw new java.lang.RuntimeException(ex);
    }
}