public static void addOutgoingMessage(java.lang.String recipient, com.example.project.Serializable.Message message) {
    java.util.Queue<com.example.project.Serializable.Message> queue = com.example.project.SessionManager.SessionManager.outgoingQueue.get(recipient);
    if (queue == null) {
        queue = new java.util.LinkedList<>();
        queue.add(message);
        com.example.project.SessionManager.SessionManager.outgoingQueue.put(recipient, queue);
    }else {
        queue.add(message);
        com.example.project.SessionManager.SessionManager.outgoingQueue.replace(recipient, queue);
    }
}