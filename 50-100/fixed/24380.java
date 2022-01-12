public boolean add(T value) {
    if (!(contains(value))) {
        CoarseGrainedListSet<T>.LLNode newNode = new LLNode();
        newNode.next = null;
        newNode.value = value;
        listLock.lock();
        end.next = newNode;
        end = end.next;
        listLock.unlock();
        return true;
    }
    return false;
}