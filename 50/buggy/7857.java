@java.lang.Override
public TT next() {
    TT head = list.head;
    list = list.tail;
    return head;
}