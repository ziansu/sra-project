private client.model.CellState getCellState(client.ai.Tile tile) {
    client.model.Beetle beetle = tile.beetles.get(0);
    if (tile.beetles.isEmpty())
        return client.model.CellState.Blank;
    
    if ((beetle.getTeam()) == (AI.world.getTeamID()))
        return client.model.CellState.Ally;
    
    return client.model.CellState.Enemy;
}