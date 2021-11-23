public boolean playerMove(nz.ac.aut.ense701.gameModel.MoveDirection direction) {
    boolean successfulMove = false;
    if (isPlayerMovePossible(direction)) {
        nz.ac.aut.ense701.gameModel.Position newPosition = player.getPosition().getNewPosition(direction);
        nz.ac.aut.ense701.gameModel.Terrain terrain = island.getTerrain(newPosition);
        player.moveToPosition(newPosition, terrain);
        island.updatePlayerPosition(player);
        successfulMove = true;
        checkForHazard();
        updateGameState();
    }else
        if (!(enoughStaminaToMove))
            outputMessages.add("You are out of breath, you need to rest before you can move again");
        
    
    return successfulMove;
}