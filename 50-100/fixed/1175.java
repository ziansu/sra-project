public DeterminizationTree.TreeNode copyIntoList(DeterminizationTree.TreeNode parent, java.util.List<DeterminizationTree.TreeNode> nodelist) {
    DeterminizationTree.TreeNode toRet = new DeterminizationTree.TreeNode(this.states, parent);
    nodelist.add(toRet);
    for (DeterminizationTree.TreeNode child : this.children) {
        toRet.children.add(child.copyIntoList(toRet, nodelist));
    }
    return toRet;
}