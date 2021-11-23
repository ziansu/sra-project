@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    s.append("[");
    SparseArray.Node<T> currentNode = this.first;
    for (T item : this) {
        s.append(item);
        s.append(", ");
    }
    s.append("]");
    return s.toString();
}