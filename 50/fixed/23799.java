@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.RequestMapping(value = " /boards/{gameid}/places", method = RequestMethod.GET, produces = "application/json")
@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public java.util.List<de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Place> getAvailablePlacesOnBoard(@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "gameid")
final long gameID) {
    return de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Main.boardService.getPlaces(gameID);
}