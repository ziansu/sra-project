@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.RequestMapping(value = " /boards/{gameid}/players/{playerid}", method = RequestMethod.DELETE, produces = "application/json")
@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public void removePlayerFromBoard(@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "gameid")
final long gameID, @de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "playerid")
final java.lang.String playerID) throws de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException {
    if (isGameIdValid(gameID)) {
        de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Main.boardService.removePlayerFromBoard(gameID, playerID);
    }else {
        throw new de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException("Game does not Exists");
    }
}