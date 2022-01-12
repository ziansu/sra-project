public void clicked(com.taxe.game.GameCore game) {
    if ((getState()) == (TrainStates.ACTIVE)) {
        com.taxe.game.commands.StartPathCommand.executeCommand(game, this);
    }else
        if ((getState()) == (TrainStates.SELECTED)) {
            com.taxe.game.commands.ResetPathCommand.executeCommand(game, this);
        }
    
}