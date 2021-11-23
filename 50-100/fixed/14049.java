public java.lang.String remove(java.lang.String key) {
    ru.spbau.mit.List.Node node = head.next;
    while ((node != (head)) && (!(key.equals(node.key)))) {
        node = node.next;
    } 
    if (node == (head))
        return null;
    
    java.lang.String removedValue = node.value;
    node.prev.next = node.next;
    node.next.prev = node.prev;
    (size)--;
    return removedValue;
}