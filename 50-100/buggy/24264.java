@java.lang.Override
public boolean remove(E element) {
    boolean result = false;
    if ((element != null) && (!(priorityQueue.isEmpty()))) {
        result = priorityQueue.remove(element);
        treeSet.remove(element);
    }
    return result;
}