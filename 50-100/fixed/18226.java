public com.mc1.dev.goapp.GameController.failureType checkAction(GameMetaInformation.actionType actionType, com.mc1.dev.goapp.RunningGame game, int[] position, boolean isBlacksMove) {
    if (!(checkOccupied(game, position))) {
        return com.mc1.dev.goapp.GameController.failureType.OCCUPIED;
    }
    if (!(checkSuicide(game, position, isBlacksMove))) {
        return com.mc1.dev.goapp.GameController.failureType.SUICIDE;
    }
    if (checkGameEnded(game)) {
        return com.mc1.dev.goapp.GameController.failureType.END;
    }
    return com.mc1.dev.goapp.GameController.failureType.SUCCESS;
}