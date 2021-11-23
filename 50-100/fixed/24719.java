private int reduceToPathsAndSwap(int w, java.util.LinkedList<java.lang.Integer> bigComponent) {
    java.util.BitSet checked = new java.util.BitSet(graph.getVertices());
    java.util.LinkedList<java.lang.Integer> currentPath;
    for (java.lang.Integer i : bigComponent) {
        if (!(checked.get(i))) {
            checked.set(i);
            currentPath = findPathOfOddSize(i, checked);
            if (currentPath == null) {
                continue;
            }
            swapWithinPath(w, currentPath);
            return 1;
        }
    }
    return 0;
}