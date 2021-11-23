private boolean canGoLeft(int x, int y, java.util.List<Player.Move> moves) {
    return ((walls.stream().filter(( w) -> !(w.isHorizontal())).noneMatch(( w) -> w.blocks((x + 1), y, x, y))) && ((x - 1) >= 0)) && (hasNotBeenAtLocation(moves, (x - 1), y));
}