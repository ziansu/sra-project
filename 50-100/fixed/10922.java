boolean add(E item) {
    boolean newItem = !(this.linkedHashSet.remove(item));
    this.linkedHashSet.add(item);
    if ((this.linkedHashSet.size()) >= (com.box.sdk.LRUCache.MAX_SIZE)) {
        java.util.Iterator<E> it = this.linkedHashSet.iterator();
        it.next();
        it.remove();
    }
    return newItem;
}