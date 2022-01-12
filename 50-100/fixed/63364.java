@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof dictionaryBinaryTree.MySortedTree.MyTreeNode<?>) {
        if (((dictionaryBinaryTree.MySortedTree.MyTreeNode<?>) (obj)).item.equals(this.item)) {
            return true;
        }
    }
    return false;
}