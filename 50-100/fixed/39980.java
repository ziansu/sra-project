@java.lang.SuppressWarnings(value = "unchecked")
private java.lang.String pollNextClient(java.lang.String documentKey) {
    java.util.List<java.lang.String> queue = queueMap.get(documentKey);
    if ((queue != null) && (!(queue.isEmpty()))) {
        return queue.remove(0);
    }
    return null;
}