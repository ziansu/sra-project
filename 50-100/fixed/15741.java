private void traverse(com.dg.assignment.tree.Node<T> node, java.util.LinkedList<com.dg.assignment.tree.Node<T>> path, java.util.List<java.util.List<com.dg.assignment.tree.Node<T>>> paths) {
    path.add(node);
    if (node.isLeaf()) {
        paths.add(path);
    }else {
        for (com.dg.assignment.tree.Node<T> n : node.getChildren()) {
            traverse(n, new java.util.LinkedList<com.dg.assignment.tree.Node<T>>(path), paths);
        }
    }
}