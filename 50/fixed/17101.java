private void insert(BinomialHeap.BinomialNode x) {
    BinomialHeap H1 = new BinomialHeap();
    x.parent = BinomialHeap.NIL;
    x.child = BinomialHeap.NIL;
    x.sibling = BinomialHeap.NIL;
    x.degree = 0;
    H1.head = x;
    union(H1);
}