public Vertex genmove(Color color) {
    ai.Player player = players[color.getIndex()];
    if ((player.getPlayingColor()) != color) {
        player.startGame(game, color);
    }
    player.setGame(game);
    int move;
    if (game.isOver()) {
        move = -1;
    }else {
        move = player.playMove();
    }
    return Vertex.get(move, game.getGrid());
}