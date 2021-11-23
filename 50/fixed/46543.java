@java.lang.Override
public c346ut.ILinkedList<T> after(int n) {
    for (int i = 0; i < (n - 1); i++) {
        next = next.next();
    }
    return next;
}