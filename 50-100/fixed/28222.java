public java.util.List<Message> deleteById(java.util.List<Message> msg, java.lang.String id) {
    messages = msg;
    for (Message item : messages) {
        if (item.getId().equals(id)) {
            messages.remove(item);
            java.lang.System.out.println((("message with ID" + id) + "has been delete"));
            break;
        }
    }
    return messages;
}