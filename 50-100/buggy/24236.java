public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    com.bastronaut.linkedlist.LinkedList<K, V>.Node node = topNode;
    while ((node.next) != null) {
        sb.append(node.toString());
        node = node.next;
    } 
    return sb.toString();
}