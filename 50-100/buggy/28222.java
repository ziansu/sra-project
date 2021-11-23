public java.util.List<Message> deleteById(java.util.List<Message> messages, java.lang.String id) {
    this.messages = messages;
    for (Message item : messages) {
        if (item.getMessage().equalsIgnoreCase(id)) {
            messages.remove(item);
            java.lang.System.out.println((("message with ID" + id) + "has been delete"));
        }
    }
    return messages;
}