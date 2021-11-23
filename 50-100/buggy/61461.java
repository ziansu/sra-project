public int minTreeRank() {
    if (this.empty()) {
        return -1;
    }
    BinomialHeap.BinomialTree min = this.roots.get(0);
    for (int i = 0; i < (this.roots.length()); i++) {
        min = this.roots.get(i);
        if (min != null) {
            break;
        }
    }
    return min.rank;
}