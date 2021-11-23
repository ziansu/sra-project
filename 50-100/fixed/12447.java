public boolean isValid() {
    verifyNIL();
    int lastDegree = -(BinomialHeap.INFINITY);
    BinomialHeap.BinomialNode x = this.head;
    while (x != (BinomialHeap.NIL)) {
        if ((recVal(x, new int[2])[0]) == 0) {
            return false;
        }
        if ((x.degree) <= lastDegree) {
            return false;
        }
        lastDegree = x.degree;
        x = x.sibling;
    } 
    return true;
}