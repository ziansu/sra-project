@java.lang.Override
public void persist(java.util.List<com.appmetr.s2s.events.Action> actionList) {
    synchronized(batchQueue) {
        com.appmetr.s2s.Batch batch = new com.appmetr.s2s.Batch(((batchId)++), actionList);
        batchQueue.push(batch);
    }
}