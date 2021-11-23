public datastructure.DrawNode getDrawNode(int index) {
    for (datastructure.DrawNode dNode : drawNodes) {
        if ((dNode.getIndex()) == index) {
            return dNode;
        }
    }
    return null;
}