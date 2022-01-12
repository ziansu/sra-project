private boolean canGoUp(int x, int y, java.util.List<Player.Move> moves) {
    return ((walls.stream().filter(Player.Wall::isHorizontal).noneMatch(( w) -> w.blocks(x, (y + 1), x, y))) && ((y - 1) >= 0)) && (hasNotBeenAtLocation(moves, x, (y - 1)));
}