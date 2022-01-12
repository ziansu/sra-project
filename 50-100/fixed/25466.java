public com.example.project.Serializable.Message getNextOutgoing(java.lang.String recipient) {
    recipient = recipient.toLowerCase();
    java.util.Queue<com.example.project.Serializable.Message> queue = com.example.project.SessionManager.SessionManager.outgoingQueue.get(recipient);
    if ((queue == null) || ((queue.size()) == 0)) {
        return new com.example.project.Serializable.Message(true);
    }else {
        return queue.remove();
    }
}