void addChildNode(com.CPS2002.assignment.Path.DataObjects.Node n) {
    childNodes.add(n);
    n.addParentNodes(this);
}