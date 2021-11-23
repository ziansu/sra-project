public com.cengha.divider2.model.Game retrieveGame(java.lang.Long gameId) {
    com.cengha.divider2.model.Game game = this.getById(gameId);
    java.util.List<com.cengha.divider2.model.Move> allMovesByGameId = moveService.getAllByGameId(gameId);
    game.setMoves(allMovesByGameId);
    if ((allMovesByGameId.size()) > 0) {
        game.setLastMove(allMovesByGameId.get(((allMovesByGameId.size()) - 1)));
    }
    return game;
}