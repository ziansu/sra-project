public void moveWithoutVerification(final com.nullpointergames.boardgames.Position from, final com.nullpointergames.boardgames.Position to) {
    try {
        com.nullpointergames.boardgames.chess.RuleFactory.getRule(board, from).moveWithoutVerification(to);
    } catch (com.nullpointergames.boardgames.chess.exceptions.PromotionException e) {
    }
    nextTurn();
}