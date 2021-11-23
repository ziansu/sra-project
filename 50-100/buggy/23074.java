public byte[] selectMove() {
    com.developersam.ten.ai.Node nodeToBeReturned = tree.getChildren().get(0);
    double maxProbability = nodeToBeReturned.getWinningProbability();
    for (com.developersam.ten.ai.Node childNode : tree.getChildren()) {
        double probability = childNode.getWinningProbability();
        if (probability > maxProbability) {
            nodeToBeReturned = childNode;
        }
    }
    return nodeToBeReturned.getMove();
}