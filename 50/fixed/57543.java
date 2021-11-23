public boolean seen(long msgId) {
    boolean seen = (nonContiguousMsgIds.contains(msgId)) || (msgId <= (highestContiguousMsgId));
    tryReconcile();
    return seen;
}