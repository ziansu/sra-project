private boolean goodPosition(game.graphs.Position pos) {
    try {
        game.graphs.ComputerVertex toCheck = boardGraph.getVertex(pos);
        java.util.Set<game.graphs.ComputerVertex> neighbours = getFreeNeighours(toCheck);
        if ((neighbours.size()) == 6)
            return true;
        else
            return false;
        
    } catch (game.interfaces.InvalidPositionException e) {
        return false;
    } catch (game.graphs.EmptySetException e) {
        return false;
    }
}