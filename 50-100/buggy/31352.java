public boolean joinGame(shared.definitions.CatanColor color) {
    this.updateGameList();
    shared.response.StandardResponse response = model.ModelFacade.getInstance().joinGame(new shared.parameters.JoinGameParam(game.getId(), color.name().toLowerCase()));
    if (response.isValid()) {
        setGameInfo();
        model.ModelFacade.getInstance().updateGameModel();
        return true;
    }
    return false;
}