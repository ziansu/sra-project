public static void resetInstance() {
    model.GameCreation.instance.gameEvents.clear();
    model.GameCreation.instance.gameActions.clear();
    model.GameCreation.instance.players.clear();
    model.GameCreation.instance.cardSettings.reset();
    model.GameCreation.instance.gameSettings.reset();
    model.GameCreation.instance.rectangleBlueprints.clear();
    model.GameCreation.instance.tableGrid.reset();
}