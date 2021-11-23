private source.Node<T> find(T value, source.Node<T> node) {
    if (node == null) {
        return null;
    }
    int comparison = value.compareTo(node.value);
    if (comparison == 0) {
        return node;
    }else
        if (comparison > 0) {
            return find(value, node.rightChild);
        }else {
            return find(value, node.leftChild);
        }
    
}