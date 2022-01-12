public DataStructure.LinkedList2<T>.Node search(T value) {
    DataStructure.LinkedList2<T>.Node x = nil.next;
    nil.key = value;
    while ((x.key) != value) {
        x = x.next;
    } 
    nil.key = null;
    if (x == (nil)) {
        return null;
    }
    return x;
}