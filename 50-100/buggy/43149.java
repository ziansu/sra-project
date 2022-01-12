public void meld(BinomialHeap other) {
    BinomialHeap safeOther = other;
    for (int i = 0; i < (safeOther.roots.length()); i++) {
        if ((safeOther.roots.get(i)) != null) {
            this.insert(safeOther.roots.get(i));
        }
    }
}