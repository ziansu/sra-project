private source.Node<T> find(T key, source.Node<T> node) {
    if (node == null) {
        return null;
    }
    int comparison = key.compareTo(node.key);
    if (comparison == 0) {
        return node;
    }else
        if (comparison > 0) {
            return find(key, node.rightChild);
        }else {
            return find(key, node.leftChild);
        }
    
}