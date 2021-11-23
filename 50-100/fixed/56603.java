public static void executeCommand(com.taxe.game.GameCore game, java.lang.Object target) {
    if (!(target instanceof com.taxe.game.trains.Train)) {
        throw new java.lang.IllegalArgumentException("target must be an instance of Train");
    }
    com.taxe.game.commands.ResetPathCommand.executeCommand(game, target);
    com.taxe.game.trains.Train t = ((com.taxe.game.trains.Train) (target));
    t.setState(TrainStates.SELECTED);
    com.taxe.game.commands.ContinuePathCommand.executeCommand(game, t.getNode());
}