public void confirmTurn() {
    java.util.ArrayList<com.tdt4240.RawHeroes.event.move.Move> moves = boardMover.confirmMoves();
    com.tdt4240.RawHeroes.network.communication.Response.ResponseMessage responseMessage = clientConnection.doMoves(game.getId(), moves);
    java.lang.System.out.println((((responseMessage.getType()) + ", ") + (responseMessage.getContent())));
    boardController.setState(new com.tdt4240.RawHeroes.gameLogic.controllers.boardController.BoardControllerReplayState(boardController, board));
    endGameState = true;
}