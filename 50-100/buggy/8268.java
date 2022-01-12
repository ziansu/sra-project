public static void remove(int index) {
    TestListReferenceBased.Node ptr = TestListReferenceBased.head;
    TestListReferenceBased.Node nxt = TestListReferenceBased.head.getNext().getNext();
    for (int x = 0; x < index; x++) {
        ptr = ptr.getNext();
        nxt = nxt.getNext();
    }
    ptr.setNext(nxt);
}