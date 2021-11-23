public int getNoOfChildren() {
    int noOfChildren = 0;
    org.ivis.layout.LNode childNode;
    if ((this.child) == null) {
        noOfChildren = 1;
    }else {
        for (java.lang.Object childObject : this.child.getNodes()) {
            childNode = ((org.ivis.layout.LNode) (childObject));
            noOfChildren += childNode.getNoOfChildren();
        }
    }
    if (noOfChildren == 0) {
        noOfChildren = 1;
    }
    return noOfChildren;
}