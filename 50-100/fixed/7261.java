private void setPositionsOfPlayers(java.util.List<game.db.GameResultEntity> gameResults, java.util.List<java.lang.Integer> points) {
    java.util.Collections.sort(points);
    for (int i = 0; i < (points.size()); i++) {
        for (game.db.GameResultEntity gameResult : gameResults) {
            if (gameResult.getPoints().equals(points.get(i))) {
                gameResult.setPosition((i + 1));
            }
        }
    }
}