public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    int i = 1;
    for (com.bastronaut.linkedlist.LinkedList<K, V> ll : itemContainer) {
        if (ll == null) {
            java.lang.System.out.println(i);
            i++;
            continue;
        }
        sb.append(ll.toString());
    }
    return sb.toString();
}