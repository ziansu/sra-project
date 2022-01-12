@java.lang.Override
public boolean remove(E element) {
    boolean result = false;
    if ((element != null) && (!(priorityQueue.isEmpty()))) {
        result = priorityQueue.remove(element);
        if (result) {
            treeSet.remove(element);
        }
    }
    return result;
}