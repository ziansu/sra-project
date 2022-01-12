public boolean isValidMove(org.escaperun.game.model.entities.Entity entity, org.escaperun.game.model.Position desiredPosition) {
    if (((desiredPosition.x) > (rows)) || ((desiredPosition.y) > (cols)))
        return false;
    
    for (org.escaperun.game.model.entities.npc.NPC npc : NPCs) {
        if (npc.getCurrentPosition().equals(desiredPosition))
            return false;
        
    }
    org.escaperun.game.model.stage.tile.Tile tile = grid[desiredPosition.x][desiredPosition.y];
    if (!(tile.isCollidable())) {
        return true;
    }
    return false;
}