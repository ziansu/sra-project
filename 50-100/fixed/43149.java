public void meld(BinomialHeap other) {
    BinomialHeap safeOther = other;
    this.size += safeOther.size;
    for (int i = 0; i < (safeOther.roots.length()); i++) {
        this.insert(safeOther.roots.get(i));
    }
}