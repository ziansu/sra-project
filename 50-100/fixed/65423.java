public java.util.Optional<V> putBack(K key, V value) {
    java.util.Optional<V> previous = remove(key);
    piotrrr.collections.DoublyLinkedMap.DoublyLinkedList.Node<V> node = list.pushBack(value);
    map.put(key, node);
    return previous;
}