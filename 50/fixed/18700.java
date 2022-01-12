@java.lang.Override
public java.util.ArrayList<rover.messaging.AMessage> getNewMessages() {
    retrieveMessages();
    java.util.ArrayList<java.lang.String> newMessages = new java.util.ArrayList(this.messages);
    this.messages.clear();
    return rover.messaging.MessageParser.parse(newMessages);
}