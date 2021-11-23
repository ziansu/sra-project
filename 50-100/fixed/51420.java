private void enqueue(scheduling.Message m) {
    pStrategy.setPriority(m, qMap);
    int groupId = m.getGroupId();
    if (qMap.containsKey(groupId)) {
        java.util.Queue<scheduling.Message> queue = qMap.get(groupId);
        queue.add(m);
    }else {
        java.util.Queue<scheduling.Message> queue = new java.util.LinkedList<scheduling.Message>();
        queue.add(m);
        qMap.put(groupId, queue);
    }
}