@java.lang.Override
public void delete(int inKey) {
    final LeetCode.BinaryTree.TreeNode parentNode = findParentMaybeNull(inKey);
    if (parentNode == null) {
        if ((_root.val) == inKey) {
            LeetCode.BinaryTree.TreeNode replacement = replaceNodeToDelete(_root);
            _root = replacement;
        }
    }else {
        if ((parentNode.val) > inKey) {
            LeetCode.BinaryTree.TreeNode nodeToDelete = parentNode.left;
            LeetCode.BinaryTree.TreeNode replacement = replaceNodeToDelete(nodeToDelete);
            parentNode.left = replacement;
        }else {
            LeetCode.BinaryTree.TreeNode nodeToDelete = parentNode.right;
            LeetCode.BinaryTree.TreeNode replacement = replaceNodeToDelete(nodeToDelete);
            parentNode.right = replacement;
        }
    }
}