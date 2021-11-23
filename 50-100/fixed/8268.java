public static void remove(int index) {
    TestListReferenceBased.Node ptr = TestListReferenceBased.head;
    TestListReferenceBased.Node nxt = TestListReferenceBased.head.getNext();
    for (int x = 1; x < index; x++) {
        ptr = ptr.getNext();
        nxt = nxt.getNext();
    }
    ptr.setNext(ptr.getNext().getNext());
    nxt.setNext(null);
}