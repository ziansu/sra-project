public void put(K key, V value) {
    if ((root) == null) {
        root = new SplayTree.TreeNode<>(new SplayTree.Entry<>(key, value));
        (size)++;
    }else {
        put(key, value, root);
    }
}