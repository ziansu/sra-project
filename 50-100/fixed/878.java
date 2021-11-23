@com.teamwolf.controller.RequestMapping(consumes = "*/*", produces = MediaType.APPLICATION_JSON_VALUE, path = "/players", method = { RequestMethod.GET })
public com.teamwolf.controller.GamesResponse currentGamePlayers(@com.teamwolf.controller.CookieValue(value = cookieName, defaultValue = "")
java.lang.String token, @com.teamwolf.controller.RequestBody
java.lang.Integer gid) {
    com.teamwolf.controller.User u;
    if ((u = this.isSession(token)) != null) {
        java.util.List<com.teamwolf.controller.Player> players = gameMgrLogic.getAllCurrentPlayers(gid);
        com.teamwolf.controller.GamesResponse response = new com.teamwolf.controller.GamesResponse();
        response.setPlayerList(players);
        response.setSuccess(true);
        return response;
    }else
        throw new com.teamwolf.controller.AuthorizationException("You must be Logged in");
    
}