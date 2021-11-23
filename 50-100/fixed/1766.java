private void fillObjectMessage(com.redhat.mqe.lib.ClientOptions senderOptions, com.redhat.mqe.lib.ObjectMessage objectMessage) {
    try {
        com.redhat.mqe.lib.LOG.debug("Filling object data");
        if ((content.size()) == 1) {
            objectMessage.setObject(((java.io.Serializable) (content.get(0).getValue())));
        }else {
            com.redhat.mqe.lib.LOG.error(("Content is bigger then one object. " + "Don't know how to set for object message multiple data. Use ListMessage(?)"));
            java.lang.System.exit(2);
        }
    } catch (com.redhat.mqe.lib.JMSException e) {
        e.printStackTrace();
    }
}