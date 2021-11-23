@java.lang.Override
public u7.u7a2.UnlinkSmallestResult<T> unlinkSmallest(u7.u7a2.BinarySearchTree<T> tree) {
    if ((tree.left) == null) {
        return new u7.u7a2.UnlinkSmallestResult(tree, tree.right);
    }
    u7.u7a2.UnlinkSmallestResult result = unlinkSmallest(tree.left);
    tree.left = result.tree;
    return new u7.u7a2.UnlinkSmallestResult<T>(result.smallest, tree);
}