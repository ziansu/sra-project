public java.util.ArrayList<actions.Action> availableActions() {
    actions.Action terminateGame = new actions.TerminateGame();
    java.util.ArrayList<actions.Action> availableActions = dungeon.Dungeon.getAdjacentMoves(this);
    availableActions.add(terminateGame);
    java.lang.System.out.println();
    java.lang.System.out.println(availableActions);
    return availableActions;
}