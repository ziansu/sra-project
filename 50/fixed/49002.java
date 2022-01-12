public V get(java.lang.String key) {
    trie.Node n = get(root, key, 0);
    if (n == null) {
        return null;
    }
    return ((V) (n.val));
}