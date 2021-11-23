public void dumpNodesToFile() {
    Node node = head;
    java.util.ArrayList<BTreeNode> bNodeList = new java.util.ArrayList<BTreeNode>();
    while ((node.getNext()) != null) {
        bNodeList.add(node.getValue());
        node = node.getNext();
    } 
    bNodeList.add(tail.getValue());
    NodeStorage.dumpNodes(bNodeList.toArray(new BTreeNode[bNodeList.size()]));
}