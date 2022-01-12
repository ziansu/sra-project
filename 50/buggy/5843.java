public void addChild(int childIndex, de.mkrnr.goddag.Node childNode) {
    this.children.add(childIndex, childNode);
    childNode.parents.add(this);
}