@java.lang.Override
protected void broadcast(co.paralleluniverse.galaxy.core.Message message) {
    assignMessageId(message);
    if (addToPending(message, ((short) (-1))))
        broadcast(message);
    
    try {
        co.paralleluniverse.galaxy.jgroups.JGroupsComm.LOG.debug("Broadcasting (null): {}", message);
        channel.send(new co.paralleluniverse.galaxy.core.Message(null, message.toByteArray()));
    } catch (java.lang.Exception ex) {
        co.paralleluniverse.galaxy.jgroups.JGroupsComm.LOG.error(("Error while broadcasting message " + message), ex);
    }
}