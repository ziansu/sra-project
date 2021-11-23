public void cast(java.lang.String messagetext) {
    java.lang.String message_id = createUniqueId();
    (nodeClocks[id])++;
    ExtendMessage message = new ExtendMessage(id, messagetext, message_id, ExtendMessage.TYPE_MESSAGE, createClockMessage());
    multicast(message);
    mcui.debug((("Sent out: \"" + messagetext) + "\""));
}