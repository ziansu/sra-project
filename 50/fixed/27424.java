public void resetCommands() {
    for (application.models.playerAsset.Army a : armyList) {
        a.resetCommands();
    }
}