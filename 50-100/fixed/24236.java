public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    com.bastronaut.linkedlist.LinkedList<K, V>.Node node = topNode;
    if (!(isEmpty())) {
        sb.append(node.toString());
    }
    while ((node.next) != null) {
        sb.append(node.next.toString());
        node = node.next;
    } 
    return sb.toString();
}