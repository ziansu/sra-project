public static play.mvc.Result exit(java.lang.String game, java.lang.String player) {
    if ((de.paju.mensch.play.controllers.Application.sessions.get(game).removePlayer(player)) < 1)
        de.paju.mensch.play.controllers.Application.sessions.remove(game);
    
    return ok("Game restarted");
}