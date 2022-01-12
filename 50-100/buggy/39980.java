@java.lang.SuppressWarnings(value = "unchecked")
private java.lang.String pollNextClient(java.lang.String documentKey) {
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> queueMap = ((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) (getThreadLocalRequest().getAttribute(edu.caltech.cs141b.hw2.gwt.collab.server.CollaboratorServiceImpl.QUEUE_MAP)));
    java.util.List<java.lang.String> queue = queueMap.get(documentKey);
    if ((queue != null) && (!(queue.isEmpty()))) {
        return queue.remove(0);
    }
    return null;
}