private boolean dfs(final nl.rostykerei.cci.datastructure.Node<T> node, final nl.rostykerei.cci.datastructure.Node<T> finish, final java.util.Set<nl.rostykerei.cci.datastructure.Node> seen) {
    if (node == finish) {
        return true;
    }
    seen.add(node);
    for (nl.rostykerei.cci.datastructure.Node<T> n : node.getChildren()) {
        if ((!(seen.contains(n))) && (dfs(n, finish, seen))) {
            return true;
        }
    }
    return false;
}