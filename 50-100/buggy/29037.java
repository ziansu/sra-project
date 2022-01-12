public java.util.ArrayList<actions.Action> availableActions() {
    monsters.Monster dummyMonster = new monsters.Monster("Dummy", 1, 1, 1, 1, 1);
    dungeon.Dungeon dummyDungeon = new dungeon.Dungeon(dummyMonster);
    dummyDungeon.createDungeon();
    actions.Action terminateGame = new actions.TerminateGame();
    java.util.ArrayList<actions.Action> availableActions = dummyDungeon.getAdjacentMoves(this);
    availableActions.add(terminateGame);
    return availableActions;
}