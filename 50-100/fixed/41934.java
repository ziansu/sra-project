private java.awt.Point AlphaBetaSearch(NewAI.Node state) {
    long value = maxValue(state, NewAI.minScore, NewAI.maxScore);
    for (NewAI.Node child : state.getChildren()) {
        if (value == (child.value)) {
            return child.getBoard().getLastMove();
        }
    }
    return null;
}