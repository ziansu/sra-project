protected void createChildren(ex17.RyanNewsomKyleFrisbie.Node node) {
    ex17.RyanNewsomKyleFrisbie.Node rightChild = createRightNode(node);
    if (rightChild == null) {
        return ;
    }
    node.setRightChild(rightChild);
    node.setLeftChild(createLeftNode(node));
    if ((rightChild.getActualWeight()) <= (mMaximumWeightForSack)) {
        mPossibleNodesForExploration.add(node.getRightChild());
    }
    mPossibleNodesForExploration.add(node.getLeftChild());
}