private ru.ifmo.domtree.AbstractDominanceTree.Node mergeAll(ru.ifmo.domtree.AbstractDominanceTree.Node[] array, int size) {
    if (size == 0) {
        return null;
    }
    if (useRecursiveMerge) {
        ru.ifmo.domtree.AbstractDominanceTree.Node rv = array[0];
        for (int i = 1; i < size; ++i) {
            rv = merge(rv, array[i]);
        }
        return rv;
    }else {
        return mergeAllRecursively(array, 0, size);
    }
}