public DataStructure.LinkedList2<T>.Node search(T value) {
    DataStructure.LinkedList2<T>.Node x = nil.next;
    while ((x != (nil)) && ((x.key) != value)) {
        x = x.next;
    } 
    return x;
}