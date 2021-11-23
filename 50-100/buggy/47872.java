public haw.vs.superteam.gamesservice.model.Board createBoard(haw.vs.superteam.gamesservice.model.Game game) {
    haw.vs.superteam.gamesservice.api.BoardsAPI boardsAPI = getBoardsAPI(game.getComponents().getBoard());
    retrofit.Response<haw.vs.superteam.gamesservice.model.Board> response = null;
    try {
        response = boardsAPI.createBoard(game.getGameid()).execute();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    if ((response != null) && (response.isSuccess())) {
        return response.body();
    }else {
        return null;
    }
}