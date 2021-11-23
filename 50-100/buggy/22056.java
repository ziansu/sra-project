public boolean isFull(int i, int j) {
    int idx = computeIdx(i, j);
    if (idx == (-1))
        throw new java.lang.IndexOutOfBoundsException("Index out of bound!");
    
    int root = unionFind.find(idx);
    return (Percolation.isOpen(state[root])) && (Percolation.isConnectedToTop(state[root]));
}