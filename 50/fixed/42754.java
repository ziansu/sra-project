public void flush() {
    graph.flush();
    classMap.flush();
    for (game.saver.GameMap gameMap : gameMaps) {
        gameMap.flush();
    }
}