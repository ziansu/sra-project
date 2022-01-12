@java.lang.Override
public java.util.List<com.hearthsim.util.HearthActionBoardPair> playTurn(int turn, com.hearthsim.model.BoardModel board, com.hearthsim.util.factory.BoardStateFactoryBase factory) throws com.hearthsim.exception.HSException {
    if (((baseNode) == null) || ((!(baseNode.turn.data_.equals(board))) && ((baseNode.turnNum) != turn))) {
        baseNode = new com.hearthsim.util.tree.MCTSTreeNode(new com.hearthsim.util.tree.HearthTreeNode(board), turn);
    }
    com.hearthsim.util.tree.MCTSTreeNode retNode = baseNode.selectAction();
    board = retNode.turn.data_;
    return retNode.getTurnResults();
}