private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
    int expectedModCount = modCount;
    s.defaultWriteObject();
    s.writeInt(size);
    cofh.lib.util.LinkedHashList.Entry n = head;
    for (int i = 0; i < (size); i++) {
        s.writeObject(n);
        n = n.next;
    }
    if ((modCount) != expectedModCount) {
        throw new java.util.ConcurrentModificationException();
    }
}