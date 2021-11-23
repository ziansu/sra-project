private static boolean isValidMove(CardPickup.Node[] graph, int playerLocation, int playerDestination) {
    if (playerLocation == playerDestination)
        return true;
    
    for (int i = 0; i < (graph[playerLocation].getNeighborAmount()); i++) {
        if ((graph[playerLocation].getNeighbor(i).getNodeID()) == playerDestination)
            return true;
        
    }
    return false;
}