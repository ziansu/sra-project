public void WriteExpandingNodeToFile(Node ExpandingNode, java.io.PrintWriter pw) {
    for (Leaf leafToWrite : ExpandingNode.getNodeLeaves()) {
        leafToWrite.WriteEachLeaf(pw);
    }
}