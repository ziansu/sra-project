@java.lang.Override
public org.w3c.dom.Node getParentNode() {
    final int parent = document.attrParent[nodeNumber];
    if (parent > 0) {
        return document.getNode(parent);
    }
    return null;
}