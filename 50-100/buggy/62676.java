private void registerPlayer(nl.tudelft.jpacman.level.Player p, java.util.List<nl.tudelft.jpacman.board.Square> squareList, int squareIndex) {
    assert p != null;
    assert !(squareList.isEmpty());
    if (players.contains(p)) {
        return ;
    }
    players.add(p);
    nl.tudelft.jpacman.board.Square square = squareList.get(squareIndex);
    p.occupy(square);
    squareIndex++;
    squareIndex %= squareList.size();
}