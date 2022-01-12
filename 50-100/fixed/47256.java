public void updateRoot(int[][] opponentMove) {
    root = new PlayerNode(1, 1, opponentMove);
    for (MonteCarloTreeNode child : chosenChild.getChildren()) {
        if (java.util.Arrays.deepEquals(child.getMove(), opponentMove)) {
            root = ((PlayerNode) (child));
            break;
        }
    }
    root.populate(board);
}