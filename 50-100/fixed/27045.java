public java.io.Serializable Listen() throws QueueHandlers.JMSException {
    java.lang.System.out.println("Waiting for messages...");
    QueueHandlers.Message msg = mConsumer.receive(1000);
    if (msg instanceof QueueHandlers.ObjectMessage) {
        return ((QueueHandlers.ObjectMessage) (msg)).getObject();
    }else {
        if (msg != null)
            java.lang.System.out.println(("Unexpected message type: " + (msg.getClass())));
        
    }
    return null;
}