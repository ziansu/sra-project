@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.RequestMapping(value = " /boards/{gameid}/places", method = RequestMethod.GET, produces = "application/json")
@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public java.util.List<de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Place> getAvailablePlacesOnBoard(@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "gameid")
final long gameID) throws de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException {
    if (isGameIdValid(gameID)) {
        return de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Main.boardService.getPlaces(gameID);
    }else {
        throw new de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException("Game does not Exists");
    }
}