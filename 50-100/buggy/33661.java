public void removeOne(T item) {
    nodes.TreeNode<T> current = root;
    do {
        nodes.TreeNode<T> next = current.checkNode(item);
        if (current == next) {
            current.deincrementItemCount();
            return ;
        }
    } while (current != null );
}