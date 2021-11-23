@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((obj.getClass().getName()) == (dictionaryBinaryTree.MySortedTree.MyTreeNode.class.getName())) {
        dictionaryBinaryTree.MySortedTree.MyTreeNode node = ((dictionaryBinaryTree.MySortedTree.MyTreeNode) (obj));
        return (this.item.compareTo(node.item)) == 0;
    }
    return false;
}