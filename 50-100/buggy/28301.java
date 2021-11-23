private void checkForTrigger() {
    nz.ac.aut.ense701.gameModel.Position current = player.getPosition();
    boolean hadTrigger = island.hasTrigger(current);
    if (hadTrigger) {
        timer.cancel();
        nz.ac.aut.ense701.gameModel.Occupant trigger = island.getTrigger(current);
        island.removeOccupant(current, trigger);
        state = GameState.QUIZ;
        island.removeOccupant(current, occupant);
    }
}