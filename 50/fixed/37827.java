@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public com.org.gameofthree.endpoint.dto.GamePlayerMapping createOrJoinGame(@org.springframework.web.bind.annotation.RequestBody
com.org.gameofthree.endpoint.dto.PlayerDetails newPlayer) throws com.org.gameofthree.exception.InvalidClientRequestException {
    com.org.gameofthree.endpoint.dto.GamePlayerMapping gamePlayerMapping = gameCoordinator.createOrJoinGame(newPlayer.getName(), newPlayer.isMachine());
    return gamePlayerMapping;
}