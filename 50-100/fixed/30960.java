private void sendMessage(org.exist.replication.shared.eXistMessage msg) {
    org.exist.replication.jms.publish.JMSMessageSender sender = new org.exist.replication.jms.publish.JMSMessageSender(parameters);
    try {
        sender.sendMessage(msg);
    } catch (org.exist.replication.shared.TransportException ex) {
        org.exist.replication.jms.publish.ReplicationTrigger.LOG.error(ex.getMessage(), ex);
    } catch (java.lang.Throwable ex) {
        org.exist.replication.jms.publish.ReplicationTrigger.LOG.error(ex.getMessage(), ex);
    }
}