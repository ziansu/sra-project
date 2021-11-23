public org.jenkinsci.plugins.dirdigger.TreeNode<T> addChild(T child) {
    org.jenkinsci.plugins.dirdigger.TreeNode<T> childNode = new org.jenkinsci.plugins.dirdigger.TreeNode<T>(child);
    this.children.add(childNode);
    return childNode;
}