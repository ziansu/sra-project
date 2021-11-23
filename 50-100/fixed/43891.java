static <K extends java.lang.Comparable<K>, V> V search(final io.github.emanuelpalm.util.ImmutableBinaryTree.Node<K, V> n, final K k) {
    if (n == null) {
        return null;
    }
    final int c = n.key.compareTo(k);
    if (c > 0) {
        return io.github.emanuelpalm.util.ImmutableBinaryTree.Node.search(n.left, k);
    }else
        if (c < 0) {
            return io.github.emanuelpalm.util.ImmutableBinaryTree.Node.search(n.right, k);
        }
    
    return n.value;
}