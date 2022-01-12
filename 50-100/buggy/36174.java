private int compressedFind(int idx) {
    int parent = parents[idx];
    while (parent != (parents[parent])) {
        parent = parents[parent];
    } 
    int curParent = parents[idx];
    while (curParent != (parents[curParent])) {
        int tmp = parents[curParent];
        parents[curParent] = parent;
        curParent = tmp;
    } 
    return parent;
}