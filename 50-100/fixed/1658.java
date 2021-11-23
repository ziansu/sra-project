private client.model.CellState getCellState(client.ai.Tile tile) {
    if (tile.beetles.isEmpty())
        return client.model.CellState.Blank;
    
    client.model.Beetle beetle = tile.beetles.get(0);
    if ((beetle.getTeam()) == (AI.world.getTeamID()))
        return client.model.CellState.Ally;
    
    return client.model.CellState.Enemy;
}