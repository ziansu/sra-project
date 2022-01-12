@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    s.append("[");
    SparseArray.Node<T> currentNode = this.first;
    int index = 0;
    for (T item : this) {
        s.append(item);
        if (index < ((this.length) - 1)) {
            s.append(", ");
        }
        index++;
    }
    s.append("]");
    return s.toString();
}