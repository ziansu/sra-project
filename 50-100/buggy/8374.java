public void removeOne(T item) {
    nodes.TreeNode<T> current = root;
    while (current != null) {
        nodes.TreeNode<T> next = current.checkNode(item);
        if (current == next) {
            current.deincrementItemCount();
            return ;
        }
    } 
}