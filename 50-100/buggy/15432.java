@org.springframework.web.bind.annotation.RequestMapping(value = "/{playerId}/move", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String sendNumber(@org.springframework.web.bind.annotation.RequestParam
java.lang.String gameId, @org.springframework.web.bind.annotation.PathVariable
long playerId, @org.springframework.web.bind.annotation.RequestParam
int number) {
    com.org.gameofthree.endpoint.dto.MoveDetails moveDetails = new com.org.gameofthree.endpoint.dto.MoveDetails();
    moveDetails.setNumber(number);
    moveDetails.setPlayerId(playerId);
    org.springframework.http.HttpEntity<java.lang.String> httpEntity = new org.springframework.http.HttpEntity<java.lang.String>(new com.google.gson.Gson().toJson(moveDetails), headers);
    org.springframework.http.ResponseEntity<java.lang.String> gameServerResponse = restTemplate.exchange(((com.org.gameofthree.PlayerApp.GAME_SERVER) + gameId), HttpMethod.POST, httpEntity, java.lang.String.class);
    return gameServerResponse.getBody();
}