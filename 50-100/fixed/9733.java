public java.lang.String toString() {
    SinglyLinkedNode<E> current = head;
    if (this.isEmpty()) {
        return "[]";
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(("[" + (current.data)));
    while ((current.next) != null) {
        current = current.next;
        sb.append(", ").append(current.data);
    } 
    sb.append("]");
    return sb.toString();
}