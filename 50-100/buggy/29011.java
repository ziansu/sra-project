public synchronized void add(@com.sun.javafx.beans.annotations.NonNull
K key, @com.sun.javafx.beans.annotations.NonNull
V val) {
    if ((cache.size()) == (maxCapacity)) {
        evictItem();
    }
    if (cache.containsKey(key)) {
        removeNodeFromList(cache.get(key));
    }
    cache.put(key, insertLinkedList(key, val));
}