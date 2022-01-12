private algo.BSTMap<K, V>.Node findMinNode(algo.BSTMap<K, V>.Node node) {
    algo.BSTMap<K, V>.Node parent = node;
    algo.BSTMap<K, V>.Node child = parent.left;
    if ((child.left) == null) {
        parent.left = null;
        return child;
    }else {
        return findMinNode(child);
    }
}