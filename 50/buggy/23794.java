protected final void updateMoves() {
    undoableMoves = getMoveDelegate().getMovesMade();
    this.undoableMovesPanel.setMoves(new java.util.ArrayList(m_undoableMoves));
}