public boolean hasLiberties(int x, int y, game.Stone s) {
    return (getLiberties(x, y, s, new java.util.HashSet<>(), new java.util.HashSet<>()).size()) > 0;
}