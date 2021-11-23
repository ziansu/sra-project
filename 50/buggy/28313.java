private java.util.Queue<tech.srwaggon.lings.net.message.Message> readAllMessages() throws java.io.IOException {
    java.util.Queue<tech.srwaggon.lings.net.message.Message> messages = com.google.common.collect.Lists.newLinkedList();
    if (connection.hasLine()) {
        messages.add(connection.readJson(tech.srwaggon.lings.net.message.Message.class));
    }
    return messages;
}