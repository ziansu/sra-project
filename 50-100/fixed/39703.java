private void drop(util.MFUCache.Node<K, V> node) {
    assert node != null;
    if ((head) == (tail))
        head = tail = null;
    else
        if ((head) == node) {
            head = node.next;
            head.prev = null;
        }else
            if ((tail) == node) {
                tail = node.prev;
                tail.next = null;
            }else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
        
    
    node.prev = node.next = null;
}