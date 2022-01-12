private void applyAndAnimateAdditions(java.util.List<com.example.ttpm.game_on.adapter.models.BoardGame> newBoardGames) {
    for (int i = 0, count = newBoardGames.size(); i < count; i++) {
        com.example.ttpm.game_on.adapter.models.BoardGame boardGame = newBoardGames.get(i);
        if (mBoardGames.contains(boardGame)) {
            addGame(i, boardGame);
        }
    }
}