private game.graphs.ComputerVertex findGoodPositionInRow(int y) throws game.graphs.NoGoodVertexException {
    int xlim = boardGraph.getXLim();
    for (int x = 1; x < xlim; x++) {
        game.graphs.Position pos = new game.graphs.Position(y, x);
        boolean isGood = goodPosition(pos);
        if (isGood) {
            try {
                game.graphs.ComputerVertex newHead = boardGraph.getVertex(pos);
                return newHead;
            } catch (game.interfaces.InvalidPositionException e) {
                continue;
            }
        }
    }
    throw new game.graphs.NoGoodVertexException();
}