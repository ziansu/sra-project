private my.epam.collections.CustomTreeMap<K, V>.CustomNodeEntry<K, V> removeMin(my.epam.collections.CustomTreeMap<K, V>.CustomNodeEntry<K, V> node) {
    if ((node.left) == null)
        return node.right;
    
    node.left = removeMin(node.left);
    return node;
}