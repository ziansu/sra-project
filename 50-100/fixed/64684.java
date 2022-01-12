public void sendPrivateMessage(java.lang.String username, java.lang.String content) {
    try {
        javax.jms.Queue dest = qSession.createQueue(username);
        javax.jms.Message msg = qSession.createTextMessage();
        msg.setStringProperty(jms.JMSChatClient.MSG_PROPERTY_USERNAME, this.username);
        msg.setStringProperty(jms.JMSChatClient.MSG_PROPERTY_CONTENT, content);
        privateMsgSender.send(dest, msg);
    } catch (javax.jms.JMSException e) {
        java.lang.System.err.println(("Could not send private message: " + (e.getMessage())));
    }
}