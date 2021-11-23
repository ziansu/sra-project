public void flush() {
    classMap.flush();
    graph.flush();
    for (game.saver.GameMap gameMap : gameMaps) {
        gameMap.flush();
    }
}