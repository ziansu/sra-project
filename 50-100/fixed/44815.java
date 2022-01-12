@org.springframework.web.bind.annotation.RequestMapping(value = "/game", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
public org.springframework.http.ResponseEntity<br.edu.ufcg.es.model.Game> registerGame(@org.springframework.web.bind.annotation.RequestHeader(value = "Authorization")
java.lang.String token, @javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
br.edu.ufcg.es.model.DTO.RegisterGame registerGame) {
    br.edu.ufcg.es.model.User user = tokenService.getUser(token);
    br.edu.ufcg.es.model.Game game = new br.edu.ufcg.es.model.Game(registerGame.getDate(), registerGame.getLocal(), registerGame.getSport(), registerGame.getDescription(), user.getId());
    gameService.create(game);
    updateUserGames(user, game.getId());
    return new org.springframework.http.ResponseEntity(game, org.springframework.http.HttpStatus.CREATED);
}