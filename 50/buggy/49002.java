public V get(java.lang.String key) {
    trie.Node n = get(root, key, o);
    if (n == null) {
        return null;
    }
    return ((V) (n.val));
}