private java.awt.Point AlphaBetaSearch(NewAI.Node state) {
    long value = maxValue(state, NewAI.minScore, NewAI.maxScore);
    java.lang.System.out.println(("Value = " + value));
    java.lang.System.out.println(evaluations);
    evaluations = 0;
    for (NewAI.Node child : state.getChildren()) {
        java.lang.System.out.println(child.value);
        if (value == (child.value)) {
            return child.getBoard().getLastMove();
        }
    }
    return null;
}