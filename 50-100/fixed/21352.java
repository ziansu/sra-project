private io.github.juanmougan.samples.trees.BinaryTree.Node<T> insert(io.github.juanmougan.samples.trees.BinaryTree.Node<T> node, T data) {
    if (node == null) {
        node = new io.github.juanmougan.samples.trees.BinaryTree.Node<T>(data);
        this.root = node;
    }else {
        int comparation = data.compareTo(node.data);
        if (comparation <= 0) {
            node.left = insert(node.left, data);
        }else {
            node.right = insert(node.right, data);
        }
    }
    return node;
}