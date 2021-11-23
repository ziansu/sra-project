private void traverse(com.dg.assignment.tree.Node<T> root, java.util.LinkedList<com.dg.assignment.tree.Node<T>> path, java.util.List<java.util.List<com.dg.assignment.tree.Node<T>>> paths) {
    path.add(root);
    if (root.isLeaf()) {
        paths.add(path);
    }else {
        for (com.dg.assignment.tree.Node<T> node : root.getChildren()) {
            traverse(node, new java.util.LinkedList<com.dg.assignment.tree.Node<T>>(path), paths);
        }
    }
}