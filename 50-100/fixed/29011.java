public synchronized void add(@com.sun.javafx.beans.annotations.NonNull
K key, @com.sun.javafx.beans.annotations.NonNull
V val) {
    if (((cache.size()) == (maxCapacity)) && (!(cache.containsKey(key)))) {
        evictItem();
    }
    remove(key);
    cache.put(key, insertLinkedList(key, val));
}