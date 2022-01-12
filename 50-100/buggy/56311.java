@java.lang.Override
public u7.u7a2.UnlinkSmallestResult<T> unlinkSmallest(u7.u7a2.BinarySearchTree<T> tree) {
    if ((tree.left) != null) {
        u7.u7a2.UnlinkSmallestResult result = unlinkSmallest(tree.left);
        return new u7.u7a2.UnlinkSmallestResult(result.smallest, new u7.u7a2.BinarySearchTree(tree.key, tree.thing, result.tree, tree.right));
    }
    return new u7.u7a2.UnlinkSmallestResult(tree, null);
}