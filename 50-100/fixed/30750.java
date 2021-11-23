public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (com.bastronaut.linkedlist.LinkedList<K, V> ll : itemContainer) {
        if (ll == null) {
            continue;
        }
        sb.append(ll.toString());
    }
    return sb.toString();
}