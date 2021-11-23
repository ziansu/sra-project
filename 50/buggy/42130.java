public int getMove() {
    mcts.TreeNode chosenNode = select();
    return nodeMove(chosenNode);
}