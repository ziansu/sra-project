private void sendMessage(org.exist.replication.shared.eXistMessage msg) throws org.exist.collections.triggers.TriggerException {
    org.exist.replication.jms.publish.JMSMessageSender sender = new org.exist.replication.jms.publish.JMSMessageSender(parameters);
    try {
        sender.sendMessage(msg);
    } catch (org.exist.replication.shared.TransportException ex) {
        org.exist.replication.jms.publish.ReplicationTrigger.LOG.error(ex.getMessage(), ex);
        throw new org.exist.collections.triggers.TriggerException(ex.getMessage(), ex);
    }
}