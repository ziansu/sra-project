public void refresh(LRUCache.Node n) {
    remove(n);
    add(n);
}